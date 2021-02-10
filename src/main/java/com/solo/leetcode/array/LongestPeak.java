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
    Deque<Integer> resultQueue = new ArrayDeque<>();
    for (int i = 1; i < nums.length; i++) {
      boolean peak = false;
      if (nums[i] > nums[i - 1]) {
        peak = true;
      }
      if (peak && (i + 1 <= nums.length - 1)) {
        peak = ((nums[i] > nums[i + 1]));

      }
      if (peak) {
        resultQueue.push(i);
      }
    }

    return resultQueue.isEmpty() ? 0 : resultQueue.pop();

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
