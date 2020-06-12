package com.solo.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

  ContainerWithMostWater containerWithMostWater;

  @BeforeEach
  void setUp() {
    containerWithMostWater = new ContainerWithMostWater();
  }

  @Test
  void baseCase() {
    Assertions
        .assertEquals(49, containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
  }

  @Test
  void one() {
    Assertions.assertEquals(1, containerWithMostWater.maxArea(new int[]{1, 1}));
  }

  @Test
  void onetwo() {
    Assertions.assertEquals(1, containerWithMostWater.maxArea(new int[]{1, 2}));
  }
}