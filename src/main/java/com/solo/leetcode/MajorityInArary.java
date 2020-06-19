package com.solo.leetcode;

public class MajorityInArary {

  /**
   * this algorithm works only for positive case i.e an majority is present in the data set
   */
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
