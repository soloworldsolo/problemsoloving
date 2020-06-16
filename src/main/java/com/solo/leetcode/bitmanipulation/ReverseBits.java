package com.solo.leetcode.bitmanipulation;

public class ReverseBits {

  public int reverseInt(int number) {
    number = (number >>> 16) | (number << 16);
    number = ((number & 0xff00ff00) >>> 8) | ((number & 0x00ff00ff) << 8);
    number = ((number & 0xf0f0f0f0) >>> 4) | ((number & 0x0f0f0f0f) << 4);
    number = ((number & 0xcccccccc) >>> 2) | ((number & 0x33333333) << 2);
    number = ((number & 0xaaaaaaaa) >>> 1) | ((number & 0x55555555) << 1);
    return number;
  }

}
