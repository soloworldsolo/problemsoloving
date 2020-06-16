package com.solo.leetcode;

public class MajorityInArary {

  public int bayersMoore(int[] nums) {
    int count = 0;
    Integer majority = null;
    for (int x : nums) {
      if (count == 0) {
        majority = x;
      }
      count += x == majority ? 1 : -1;
    }
    return majority;
  }

}
