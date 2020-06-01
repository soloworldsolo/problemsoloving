package com.solo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

  public List<String> findMissingRanges(int[] nums, int lower, int upper) {
    ArrayList<String> result = new ArrayList<>();

    long lowerBound = lower;
    long upperBound = (nums == null || nums.length == 0) ? upper : nums[0];

    if (nums == null || nums.length == 0) {
      if (lower == upper) {
        result.add(String.valueOf(lower));
      } else {
        result.add(lower + "->" + (upperBound));
      }
      return result;
    }

    for (int i = 0; i <= nums.length; i++) {
      if (upperBound > lowerBound) {
        if ((lowerBound + 1) == (upperBound)) {
          result.add(String.valueOf(lowerBound));
        } else {
          result.add((lowerBound) + "->" + (upperBound - 1));
        }
      }
      lowerBound = upperBound + 1;
      if (i < nums.length && i < nums.length - 1) {
        upperBound = nums[i + 1];
      } else {
        upperBound = (long) upper + 1;
      }

    }

    return result;
  }


}
