package com.solo.algoexpert.medium.dynamicprogramming;

import static java.lang.Integer.MAX_VALUE;

import java.util.Arrays;

/**
 * Given a value V, if we want to make change for V cents, and we have infinite supply of each of C
 * = { C1, C2, .. , Cm} valued coins, what is the minimum number of coins to make the change?
 *
 * Input: coins[] = {25, 10, 5}, V = 30
 *
 * output = 2
 */
public class MinimumNumberOfChange {

  public int minNumberOfCoinsForChange(int n, int[] denoms) {
    int[] result = new int[n + 1];
    Arrays.fill(result, Integer.MAX_VALUE);
    result[0] = 0;
    for (int i = 0; i < denoms.length; i++) {
      for (int j = 1; j < result.length; j++) {
        if (denoms[i] <= n && j >= denoms[i] && result[j - denoms[i]] != MAX_VALUE) {
          result[j] = Math.min(result[j], 1 + result[j - denoms[i]]);
        }
      }
    }

    return result[n] == MAX_VALUE ? -1 : result[n];
  }
}
