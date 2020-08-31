package com.solo.graphtheory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CycleDetectionTest {

  CycleDetection cycleDetection;

  @BeforeEach
  void setUp() {
    cycleDetection = new CycleDetection();
  }

  @Test
  void testIsCyclePresent() {
    Assertions.assertTrue(
        cycleDetection.cycleDeetction(new int[][]{{1, 0}, {0, 2}, {2, 1}, {0, 3}, {3, 4}}, 5));
  }
}