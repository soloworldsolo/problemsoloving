package com.solo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

  public List<String> findMissingRanges(int[] nums, int lower, int upper) {
    ArrayList<String> result = new ArrayList<>();

    long lowerBound = lower;

    if (nums == null || nums.length == 0) {
      if (lower == upper) {
        result.add(String.valueOf(lower));
      } else {
        result.add(lower + "->" + (upper));
      }
      return result;
    }
    long upperBound = nums[0];

    for (int i = 0; i <= nums.length; i++) {
      if (upperBound > lowerBound) {
        printElements(lowerBound, upperBound, result);
      }
      lowerBound = upperBound + 1;
      if (i < nums.length - 1) {
        upperBound = nums[i + 1];
      } else {
        upperBound = (long) upper + 1;
      }

    }

    return result;
  }

  private void printElements(long lower, long upper, List<String> result) {
    StringBuilder builder = new StringBuilder();
    builder.append(lower);
    if (upper - 1 > lower) {
      builder.append("->");
      builder.append(upper - 1);
    }
    result.add(builder.toString());
  }

}
