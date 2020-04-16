package com.solo.algoexpert.medium.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberOfWaysToMakeChangeTest {

  NumberOfWaysToMakeChange numberOfWaysToMakeChange;

  @BeforeEach
  void setUp() {
    numberOfWaysToMakeChange = new NumberOfWaysToMakeChange();
  }

  @Test
  void numberOfWaysToMakeChange() {
    int expected = 4;
    Assertions.assertEquals(4,
        numberOfWaysToMakeChange.numberOfWaysToMakeChange(10, new int[]{1, 5, 10, 25}));
  }

  @Test
  void regressionTestforPositivecase() {
    int expected = 13;
    Assertions.assertEquals(expected,
        numberOfWaysToMakeChange.numberOfWaysToMakeChange(25, new int[]{1, 5, 10, 25}));
  }


  @Test
  void numberofwaysOnedimensional() {
    int expected = 4;
    Assertions.assertEquals(4,
        numberOfWaysToMakeChange
            .numberOfWaystoMakeChangeOneDimensional(10, new int[]{1, 5, 10, 25}));
  }
}