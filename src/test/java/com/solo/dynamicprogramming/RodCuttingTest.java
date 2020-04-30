package com.solo.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RodCuttingTest {

  RodCutting rodCutting;

  @Test
  void baseCase() {
    rodCutting = new RodCutting();
    Assertions.assertEquals(22, rodCutting
        .rodCutting(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{1, 5, 8, 9, 10, 17, 17, 20}));
  }

  @Test
  void baseCase2() {
    rodCutting = new RodCutting();
    Assertions.assertEquals(24, rodCutting
        .rodCutting(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{3, 5, 8, 9, 10, 17, 17, 20}));
  }
}