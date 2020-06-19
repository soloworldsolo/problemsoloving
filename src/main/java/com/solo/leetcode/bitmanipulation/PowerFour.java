package com.solo.leetcode.bitmanipulation;

public class PowerFour {

  public boolean isPowerOfFour(int number) {

    return number > 0 && ((number & (number - 1)) == 0) && ((number & 0xaaaaaaaa) == 0);
    
  }

}
