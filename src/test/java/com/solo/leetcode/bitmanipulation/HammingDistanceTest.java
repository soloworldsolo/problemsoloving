package com.solo.leetcode.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HammingDistanceTest {

  HammingDistance hammingDistance;

  @BeforeEach
  void setUp() {
    hammingDistance = new HammingDistance();
  }

  @Test
  void testing() {
    Assertions.assertEquals(2, hammingDistance.hammingDistance(1, 4));
  }

  @Test
  void testingFiveToFour() {
    Assertions.assertEquals(1, hammingDistance.hammingDistance(4, 5));
  }
}