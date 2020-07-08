package com.solo.leetcode.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SingleNumberThreeTest {

  SingleNumberThree singleNumberThree;

  @BeforeEach
  void setUp() {
    singleNumberThree = new SingleNumberThree();
  }

  @Test
  void name() {
    Assertions.assertEquals(new int[]{3, 5},
        singleNumberThree.singleNumberThree(new int[]{1, 2, 1, 3, 2, 5}));
  }
}