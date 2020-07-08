package com.solo.leetcode.bitmanipulation;

public class SingleNumberThree {

  public int[] singleNumberThree(int[] input) {
    int bitmask = 0;

    for (int num : input) {
      bitmask ^= num;
    }
    System.out.println(bitmask);
    System.out.println(bitmask & (bitmask - 1));
    return null;
  }
}
