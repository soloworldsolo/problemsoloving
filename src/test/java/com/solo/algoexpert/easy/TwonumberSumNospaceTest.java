package com.solo.algoexpert.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwonumberSumNospaceTest {

  private TwonumberSumNospace twonumberSumNospace;

  @BeforeEach
  void setUp() {
    twonumberSumNospace = new TwonumberSumNospace();
  }

  @Test
  void baseCase() {
    int[] input = {3, 5, -4, 8, 11, 1, -1, 6};
    int[] result = twonumberSumNospace.computeSum(input, 10);
    int[] expectedResult = {-1, 11};
    Assertions.assertArrayEquals(result, expectedResult);
  }
}