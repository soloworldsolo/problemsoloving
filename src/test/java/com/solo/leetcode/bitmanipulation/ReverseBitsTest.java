package com.solo.leetcode.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseBitsTest {

  ReverseBits reverseBits;

  @BeforeEach
  void setUp() {
    reverseBits = new ReverseBits();
  }

  @Test
  void test1() {
    Assertions.assertEquals(964176192, reverseBits.reverseInt(43261596));
  }

}