package com.solo.leetcode.bitmanipulation;

public class PowerOfTwo {

  public boolean isPoweroFTwo(int n) {
    int x = n;
    return (x & -x) == x;
  }
}
