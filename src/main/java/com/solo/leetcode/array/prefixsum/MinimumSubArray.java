package com.solo.leetcode.array.prefixsum;

/**
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 *
 *
 *
 * Example 1:
 *
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 * Example 2:
 *
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * Example 3:
 *
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 */
public class MinimumSubArray {
    public int minSubArrayLen(int target, int[] nums) {
       int result = Integer.MAX_VALUE;
       int[] prefixSum = new int[nums.length];
       prefixSum[0] = nums[0];

       for(int i=1;i< nums.length;i++) {
           prefixSum[i] = prefixSum[i-1]+ nums[i];
       }
       int leftIndex=0;
       int rightIndex = 0;
       while (rightIndex < nums.length) {
           while (rightIndex <nums.length && prefixSum[rightIndex] <target) {
               rightIndex++;
           }
           if(rightIndex < nums.length) {
               int currentLength = rightIndex - leftIndex;

               int currentSum = prefixSum[rightIndex];
               while(prefixSum[rightIndex] - prefixSum[leftIndex] >= target) {
                   leftIndex++;
               }

               currentLength = (rightIndex - leftIndex)+1;
               result = Math.min(currentLength, result);
               rightIndex++;
           }


       }
       return  result == Integer.MAX_VALUE ? 0: result;
    }
}
