package com.solo.prefixsum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrefixSumTest {

  PrefixSum prefixSum;

  @BeforeEach
  void setUp() {
    prefixSum = new PrefixSum();
  }

  @Test
  void basecase() {
    int[] inputarray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int[] expected = {-2, -1, -4, 0, -1, 1, 2, -3, 1};
    int[] result = prefixSum.generatePrefixSum(inputarray);
    assertArrayEquals(expected, result);
  }
}