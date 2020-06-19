package com.solo.leetcode.bitmanipulation;

public class HammingDistance {

  public int hammingDistance(int num1, int num2) {
    int xor = num1 ^ num2;
    int count = 0;
    while (xor != 0) {
      count++;
      xor = xor & (xor - 1);
    }
    return count;
  }

}
