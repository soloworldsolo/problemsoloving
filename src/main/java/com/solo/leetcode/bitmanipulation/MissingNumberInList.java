package com.solo.leetcode.bitmanipulation;

public class MissingNumberInList {

  public int missingNumber(int[] nums) {
    int result = nums.length;
    for (int i = 0; i < nums.length; i++) {
      result ^= i ^ nums[i];
    }
    return result;
  }
}
