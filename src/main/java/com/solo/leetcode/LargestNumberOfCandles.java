package com.solo.leetcode;

import static java.util.Objects.requireNonNull;

import java.util.ArrayList;
import java.util.List;

public class LargestNumberOfCandles {

  public List<Boolean> largestNumberOfCandles(int[] candies, int extraCandies) {
    requireNonNull(candies);
    List<Boolean> result = new ArrayList<>();
    int Index = candies[0];

    for (int i = 0; i < candies.length; i++) {
      if (candies[i] >= Index) {
        Index = candies[i];
      }
      candies[i] += extraCandies;
    }

    for (int candles : candies) {
      result.add(candles >= Index);
    }
    return result;
  }

}
