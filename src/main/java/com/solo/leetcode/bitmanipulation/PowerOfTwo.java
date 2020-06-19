package com.solo.leetcode.bitmanipulation;

public class PowerOfTwo {

  /**
   * idea is if it is a power of two , the right most bit would be turned off
   *
   * 5-> 0101 (last bit is set so not a power of 2)
   *
   * 4-> 0100 (last bit set to 0 so it is a power of two)
   *
   * @return boolean if the given integr is a power of two
   */
  public boolean isPowerofTwo(int n) {
    return (n & -n) == n;
  }
}
