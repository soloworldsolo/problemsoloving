package com.solo.algoexpert.medium;

/**
 * ​Given an array of positive integers representing coin denominations and a single non-negative
 * integer representing a target amount of money, implement a function that returns the number of
 * ways to make change for that target amount using the given coin denominations. Note that an
 * unlimited amount of coins is at your disposal.
 */
public class NumberOfWaysToMakeChange {

  public static int numberOfWaysToMakeChange(int n, int[] denoms) {
    int[] noOfWays = new int[denoms.length+1];
    noOfWays[0] =1;
    for(int  i=1;i<denoms.length+1;i++) {
     // if(denoms<)
    }
      return -1;
  }

}
