package com.solo.leetcode.bitmanipulation;

public class SingleNumber {


  /**
   * using xor gate to cancel the duplicate numbers in the array
   */
  int numsingleNum(int[] nums) {
    int result = 0;
    for (int x : nums) {
      result = x ^ result;
    }
    return result;
  }

}
