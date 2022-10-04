package com.solo.leetcode.array;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * A peak element is an element that is strictly greater than its neighbors.
 *
 * Given an integer array nums, find a peak element, and return its index. If the array contains
 * multiple peaks, return the index to any of the peaks.
 *
 * You may imagine that nums[-1] = nums[n] = -∞.
 */
public class LongestPeak {

  public int findPeakElement(int[] nums) {

    for(int i=0;i< nums.length-1;i++) {
      if(nums[i] > nums[i+1]) {
        return  i;
      }
    }

   return  nums.length -1;
  }

  public int binarySearchSolution(int[] nums) {

    int startIndex = 0;
    int endIndex = nums.length - 1;
    while (startIndex < endIndex) {
      int middle = (startIndex + endIndex) / 2;

      if (nums[middle] > nums[middle + 1]) {
        endIndex = middle;
      } else {
        startIndex = middle + 1;
      }
    }
    return startIndex;
  }

}
