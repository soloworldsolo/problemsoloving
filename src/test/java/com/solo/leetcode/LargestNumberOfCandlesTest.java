package com.solo.leetcode;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LargestNumberOfCandlesTest {

  LargestNumberOfCandles largestNumberOfCandles;

  @BeforeEach
  void setUp() {
    largestNumberOfCandles = new LargestNumberOfCandles();
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(Arrays.asList(true, true, true, false, true), largestNumberOfCandles.
        largestNumberOfCandles(new int[]{2, 3, 5, 1, 3}, 3));
  }

  @Test
  void testCasefailed() {
    Assertions.assertEquals(Arrays.asList(false, true, true), largestNumberOfCandles.
        largestNumberOfCandles(new int[]{2, 8, 7}, 1));
  }
}