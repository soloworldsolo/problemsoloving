package com.solo.leetcode;

public class RemoveDuplictaeElementsInArray {

  public int removeDuplicateElementsInArray(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int result = nums.length;
    int resultArrayIndex = 0;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        result--;
      } else {
        nums[++resultArrayIndex] = nums[i];
      }
    }
    return result;
  }
}
