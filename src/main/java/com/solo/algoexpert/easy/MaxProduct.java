package com.solo.algoexpert.easy;

public class MaxProduct {

  public int maxProduct(int[] nums) {
    int[] result = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
    if (nums == null || nums.length < 2) {
      throw new IllegalArgumentException("illegal arguments");
    }
    for (int i = 0; i < nums.length; i++) {
      comapreAndShift(nums[i], result);
    }
    return (result[0] - 1) * (result[1] - 1);

  }

  private void comapreAndShift(int num, int[] nums) {

    if (num > nums[0]) {
      nums[1] = nums[0];
      nums[0] = num;
    } else if (num > nums[1]) {
      nums[1] = num;
    }
  }

}
