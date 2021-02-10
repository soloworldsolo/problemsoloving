package com.solo.leetcode.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

  ReverseInteger reverseInteger;

  @BeforeEach
  void setUp() {
    reverseInteger = new ReverseInteger();
  }

  @Test
  void test1() {
    assertEquals(321, reverseInteger.reverse(123));
  }

  @Test
  void test2overflow() {
    assertEquals(0, reverseInteger.reverse(1534236469));
  }
}