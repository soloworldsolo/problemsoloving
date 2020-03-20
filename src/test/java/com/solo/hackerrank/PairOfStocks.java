package com.solo.hackerrank;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PairOfStocks {

  public int compute(int[] input) {
    Objects.requireNonNull(input, "input should not be empty");
    Map<Integer, Integer> stockcountmap = new HashMap<>();
    for (int stock : input) {
      Integer integer = stockcountmap.get(stock);
      if (integer == null) {
        stockcountmap.put(stock, 1);
      } else {
        stockcountmap.put(stock, ++integer);
      }
    }
    int result = 0;
    if (stockcountmap.isEmpty()) {
      for (Map.Entry<Integer, Integer> integerEntry : stockcountmap.entrySet()) {
        if (integerEntry.getValue() > 1) {
          result += (integerEntry.getValue() / 2);
        }
      }
    }

    return result;
  }
}
