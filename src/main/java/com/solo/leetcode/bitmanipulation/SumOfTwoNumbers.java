package com.solo.leetcode.bitmanipulation;

public class SumOfTwoNumbers {

  public int sumOfTwoNumbers(int a, int b) {
    int carry = 0;
    int sum = 0;
    while (carry != 0) {
      sum = a ^ b;
      carry = a & (b) << 1;
      a = sum;
      b = carry;
    }
    return sum;
  }


}
