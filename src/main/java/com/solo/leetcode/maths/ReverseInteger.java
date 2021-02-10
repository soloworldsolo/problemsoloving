package com.solo.leetcode.maths;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the
 * value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */
public class ReverseInteger {

  public int reverse(int input) {
    int rev = 0;
    int maxpop = Integer.MAX_VALUE / 10;
    int minpop = Integer.MIN_VALUE / 10;
    while (input != 0) {
      int pop = input % 10;
      input /= 10;
      if (rev > maxpop || (rev == maxpop && pop > 7)) {
        return 0;
      }
      if (rev < minpop || (rev == minpop && pop < -8)) {
        return 0;
      }
      rev = rev * 10 + pop;
    }

    return rev;
  }
}
