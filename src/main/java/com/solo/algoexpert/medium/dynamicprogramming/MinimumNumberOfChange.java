package com.solo.algoexpert.medium.dynamicprogramming;

import java.util.Arrays;

public class MinimumNumberOfChange {

  public int minNumberOfCoinsForChange(int n, int[] denoms) {
    int[] result = new int[n + 1];
    Arrays.fill(result, Integer.MAX_VALUE);
    result[0] = 0;
    int toCompare = Integer.MAX_VALUE;
    for (int coin : denoms) {
      for (int i = 1; i < n + 1; i++) {
        if (coin <= n && i >= coin) {
          if (result[i - coin] != Integer.MAX_VALUE) {
            toCompare = 1 + result[i - coin];
          }
          result[i] = Math.min(result[i], toCompare);
        }
      }
    }
    return result[n];
  }
}
