package com.solo.leetcode.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SingleNumberTest {

  SingleNumber singleNumber;

  @BeforeEach
  void setUp() {
    singleNumber = new SingleNumber();
  }

  @Test
  void customTest() {
    Assertions.assertEquals(4, singleNumber.numsingleNum(new int[]{4, 1, 5, 1, 5}));
  }
}