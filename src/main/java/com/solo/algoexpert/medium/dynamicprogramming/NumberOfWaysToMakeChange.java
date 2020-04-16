package com.solo.algoexpert.medium.dynamicprogramming;

/**
 * ​Given an array of positive integers representing coin denominations and a single non-negative
 * integer representing a target amount of money, implement a function that returns the number of
 * ways to make change for that target amount using the given coin denominations. Note that an
 * unlimited amount of coins is at your disposal.
 */
public class NumberOfWaysToMakeChange {

  public int numberOfWaysToMakeChange(int n, int[] denoms) {
    int[][] noOfWays = new int[denoms.length + 1][n + 1];
    int totalWays = 0;
    for (int i = 1; i < noOfWays.length; i++) {
      int coinValue = denoms[i - 1];
      for (int j = 0; j < noOfWays[i].length; j++) {
        if (coinValue <= n) {
          if (j == 0) {
            noOfWays[i][j] = 1;
          } else {
            if (j >= coinValue) {
              int jvalue = coinValue > j ? coinValue - j : j - coinValue;
              noOfWays[i][j] = noOfWays[i - 1][j] + noOfWays[i][jvalue];
            } else {
              noOfWays[i][j] = noOfWays[i - 1][j];
            }
          }
          totalWays = noOfWays[i][j];
        }
      }
    }
    return totalWays;
  }

  public int numberOfWaystoMakeChangeOneDimensional(int n, int[] denoms) {
    int output[] = new int[n + 1];
    output[0] = 1;

    for (int coin : denoms) {
      for (int i = 1; i < output.length; i++) {
        if (coin <= n && i >= coin) {
          output[i] += output[i - coin];
        }
      }

    }
    return output[n];
  }


}
