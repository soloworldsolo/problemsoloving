package com.solo.leetcode.greedyalgorithm;

/**
 * Given an array of non-negative integers nums, you are initially positioned at the first index of
 * the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Determine if you are able to reach the last index.Z
 */
public class JumpGame {

    public int minJumps(int[] nums) {
        int jumps = 1;
        if (nums == null || nums.length < 2) {
            return 0;
        }

        int maxPos = nums[0];

        int maxSteps = nums[0];


        for (int i = 1; i < nums.length; ++i) {
            // if to reach this point
            // one needs one more jump
            if (maxSteps < i) {
                ++jumps;
                maxSteps = maxPos;
            }
            maxPos = Math.max(maxPos, nums[i] + i);
        }
        return jumps;

    }
}
