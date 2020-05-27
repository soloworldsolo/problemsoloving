package com.solo.leetcode;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinimumAppleInTreeTest {

  MinimumAppleInTree minimumAppleInTree = null;

  @BeforeEach
  void setUp() {
    minimumAppleInTree = new MinimumAppleInTree();
  }

  @Test
  void name() {

    Assertions.assertEquals(8, minimumAppleInTree
        .minTime(7, new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}},
            Arrays.asList(false, false, true, false, true, true, false)));

  }

  @Test
  void testCase2() {
    Assertions.assertEquals(6, minimumAppleInTree
        .minTime(7, new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}},
            Arrays.asList(false, false, true, false, false, true, false)));

  }

  @Test
  void testCase3() {
    Assertions.assertEquals(6, minimumAppleInTree
        .minTime(4, new int[][]{{0, 1}, {1, 2}, {0, 3}},
            Arrays.asList(true, true, true, true)));

  }

  @Test
  void testCase4() {
    Assertions.assertEquals(8, minimumAppleInTree
        .minTime(6, new int[][]{{0, 1}, {0, 2}, {1, 3}, {3, 4}, {4, 5}},
            Arrays.asList(false, true, false, false, true, true)));

  }

  @Test
  void testCase5() {
    Assertions.assertEquals(4, minimumAppleInTree
        .minTime(4, new int[][]{{0, 2}, {0, 3}, {1, 2}},
            Arrays.asList(false, true, false, false)));

  }
}