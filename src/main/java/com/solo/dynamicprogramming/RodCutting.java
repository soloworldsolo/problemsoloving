package com.solo.dynamicprogramming;

/**
 * Given a rod of length n inches and an array of prices that contains prices of all pieces of size
 * smaller than n. Determine the maximum value obtainable by cutting up the rod and selling the
 * pieces. For example, if length of the rod is 8 and the values of different pieces are given as
 * following, then the maximum obtainable value is 22
 */
public class RodCutting {

  public int rodCutting(int[] rodLength, int[] price) {
    var result = new int[rodLength.length + 1];

    for (int i = 0; i < rodLength.length; i++) {
      for (int j = 0; j < result.length; j++) {
        if (j >= rodLength[i]) {
          result[j] = Math.max(result[j], price[i] + result[j - rodLength[i]]);
        }
      }
    }

    return result[rodLength.length];
  }

}
