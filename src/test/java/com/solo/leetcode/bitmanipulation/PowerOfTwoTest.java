package com.solo.leetcode.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PowerOfTwoTest {

  PowerOfTwo powerOfTwo;

  @BeforeEach
  void setUp() {
    powerOfTwo = new PowerOfTwo();
  }

  @Test
  void test1() {
    Assertions.assertTrue(powerOfTwo.isPowerofTwo(2));
  }

  @Test
  void notAPoerOfTwo() {
    Assertions.assertFalse(powerOfTwo.isPowerofTwo(7));
  }
}