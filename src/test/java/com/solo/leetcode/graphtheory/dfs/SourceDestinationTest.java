package com.solo.leetcode.graphtheory.dfs;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SourceDestinationTest {

  private SourceDestination sourceDestination;

  @BeforeEach
  void setUp() {
    sourceDestination = new SourceDestination();
  }

  @Test
  void testCase1() {
    assertFalse(sourceDestination.leadsToDestination(3, new int[][]{{0, 1}, {0, 2}}, 0, 2));
  }

  @Test
  void testCase2() {
    assertFalse(
        sourceDestination.leadsToDestination(4, new int[][]{{0, 1}, {0, 3}, {1, 2}, {2, 1}}, 0, 3));
  }

  @Test
  void testCase3() {
    assertTrue(
        sourceDestination.leadsToDestination(4, new int[][]{{0, 1}, {0, 2}, {1, 3}, {2, 3}}, 0, 3));
  }

  @Test
  void testCase4() {
    assertFalse(sourceDestination.leadsToDestination(3, new int[][]{{0, 1}, {1, 1}, {1, 2}}, 0, 2));
  }

  @Test
  void testCase5() {
    assertFalse(sourceDestination.leadsToDestination(2, new int[][]{{0, 1}, {1, 1}}, 0, 1));
  }

  @Test
  void testCase6() {
    assertFalse(sourceDestination.leadsToDestination(3, new int[][]{{0, 1}, {0, 2}}, 0, 2));
  }

  @Test
  void testCase7() {
    assertTrue(
        sourceDestination.leadsToDestination(4, new int[][]{{0, 1}, {0, 2}, {1, 3}, {2, 3}}, 0, 3));
  }

  @Test
  void testCase8() {
    assertTrue(sourceDestination.leadsToDestination(5,
        new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}}, 0, 4));
  }


}