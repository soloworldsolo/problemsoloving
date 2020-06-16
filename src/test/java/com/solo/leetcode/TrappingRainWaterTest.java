package com.solo.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrappingRainWaterTest {

  TrappingRainWater trappingRainWater;

  @BeforeEach
  void setUp() {
    trappingRainWater = new TrappingRainWater();

  }

  @Test
  void positiveCase() {
    Assertions.assertEquals(6,
        trappingRainWater.trappingRainWater(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
  }
}