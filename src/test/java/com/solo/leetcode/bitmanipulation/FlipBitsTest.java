package com.solo.leetcode.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FlipBitsTest {

  FlipBits flipBits;

  @BeforeEach
  void setUp() {
    flipBits = new FlipBits();
  }

  @Test
  void test1() {
    Assertions.assertEquals(2, flipBits.flipBit(5));
  }
}