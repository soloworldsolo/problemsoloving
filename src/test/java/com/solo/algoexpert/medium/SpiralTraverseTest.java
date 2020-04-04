package com.solo.algoexpert.medium;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpiralTraverseTest {

  SpiralTraverse spiralTraverse;

  @BeforeEach
  void setUp() {
    spiralTraverse = new SpiralTraverse();
  }

  @Test
  void sanityTest() {
    var input =
        new int[][] {
                {1, 2, 3, 4},
                {10, 11, 12, 5},
                {9, 8, 7, 6}

        };
    var expected =
        Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    assertEquals(spiralTraverse.spiralTraverse(input),expected);
  }
}