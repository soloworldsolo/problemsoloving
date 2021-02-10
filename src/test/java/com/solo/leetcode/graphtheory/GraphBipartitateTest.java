package com.solo.leetcode.graphtheory;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GraphBipartitateTest {

  GraphBipartitate graphBipartitate;

  @BeforeEach
  void setUp() {
    graphBipartitate = new GraphBipartitate();
  }

  @Test
  void test1() {
    int[][] input = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};

    assertTrue(graphBipartitate.isBipartitae(input));
  }

  @Test
  void test2() {
    int[][] input = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};

    assertFalse(graphBipartitate.isBipartitae(input));
  }

  @Test
  void test3() {
    int[][] input = {{}, {2, 4, 6}, {1, 4, 8, 9}, {7, 8}, {1, 2, 8, 9}, {6, 9}, {1, 5, 7, 8, 9},
        {3, 6, 9}, {2, 3, 4, 6, 9}, {2, 4, 5, 6, 7, 8}};

    assertFalse(graphBipartitate.isBipartitae(input));
  }

  @Test
  void test4() {
    int[][] input = {{4}, {}, {4}, {4}, {0, 2, 3}};

    assertTrue(graphBipartitate.isBipartitae(input));
  }

  @Test
  void test5() {
    int[][] input =
        {{3, 4, 6}, {3, 6}, {3, 6}, {0, 1, 2, 5}, {0, 7, 8}, {3}, {0, 1, 2, 7}, {4, 6}, {4}, {}};

    assertTrue(graphBipartitate.isBipartitae(input));
  }

  @Test
  void test6() {
    int[][] input =
        {{1}, {0, 3}, {3}, {1, 2}};
    assertTrue(graphBipartitate.isBipartitae(input));
  }
}