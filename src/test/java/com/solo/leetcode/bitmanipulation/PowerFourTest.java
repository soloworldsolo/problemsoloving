package com.solo.leetcode.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PowerFourTest {

  PowerFour powerFour;

  @BeforeEach
  void setUp() {
    powerFour = new PowerFour();
  }

  @Test
  void isfourPowerOfFour() {
    Assertions.assertTrue(powerFour.isPowerOfFour(4));
  }

  @Test
  void iseightPowerOfFour() {
    Assertions.assertFalse(powerFour.isPowerOfFour(8));
  }

  @Test
  void issixTeenPowerOfFour() {
    Assertions.assertTrue(powerFour.isPowerOfFour(16));
  }
}