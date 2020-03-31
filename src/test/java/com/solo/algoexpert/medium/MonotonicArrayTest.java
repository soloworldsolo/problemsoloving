package com.solo.algoexpert.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonotonicArrayTest {
 MonotonicArray monotonicArray;
  @BeforeEach
  void setUp() {
     monotonicArray = new MonotonicArray();
  }

  @Test
  void sanityTest() {
    var input = new int[] {1, 5, 10, 1100, 1101, 1102, 9001};

    Assertions.assertEquals(monotonicArray.isMonotonic(input),true);

  }
}