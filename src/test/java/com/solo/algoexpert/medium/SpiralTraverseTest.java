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
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {22, 23, 24, 25, 26, 27, 28, 29, 10},
            {21, 36, 35, 34, 33, 32, 31, 30, 11},
            {20, 19, 18, 17, 16, 15, 14, 13, 12},
        };
    var expected =
        Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
            25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36);
    assertEquals(spiralTraverse.spiralTraverse(input),expected);
  }
}