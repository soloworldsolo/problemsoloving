package com.solo.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PairOfStocksTest {

  PairOfStocks pairOfStocks;

  @BeforeEach
  void setUp() {
    pairOfStocks = new PairOfStocks();
  }

  @Test
  public void basecase() {
    int[] input = {1, 2, 1, 2, 1, 3, 2};
    int result = pairOfStocks.compute(input);
    Assertions.assertEquals(result, 2);
  }
}