package com.solo.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MajorityInAraryTest {

  MajorityInArary majorityInArary;

  @BeforeEach
  void setUp() {
    majorityInArary = new MajorityInArary();
  }

  @Test
  void test1() {
    Assertions.assertEquals(2, majorityInArary.bayersMoore(new int[]{2, 2, 1, 1, 1, 2, 2}));
  }
}