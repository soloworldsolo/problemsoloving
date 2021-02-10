package com.solo.leetcode.bfs;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GraphValidTreeTest {

  GraphValidTree graphValidTree;

  @BeforeEach
  void setUp() {
    graphValidTree = new GraphValidTree();
  }

  @Test
  void positiveSuccessCase() {
    // assertTrue(graphValidTree.isValidTree(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}}));
    assertTrue(graphValidTree.unionFind(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}}));
  }

  @Test
  void failureCase() {
    assertFalse(graphValidTree.isValidTree(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {1, 4}, {1, 3}}
    ));

    assertFalse(graphValidTree.unionFind(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {1, 4}, {1, 3}}
    ));

  }

  @Test
  void failureCase2() {
    assertFalse(graphValidTree.isValidTree(4, new int[][]{{0, 1}, {2, 3}}
    ));
    assertFalse(graphValidTree.unionFind(4, new int[][]{{0, 1}, {2, 3}}
    ));

  }

  @Test
  void failureCase3() {
    assertTrue(graphValidTree.isValidTree(3, new int[][]{{1, 0}, {2, 0}}
    ));
    assertTrue(graphValidTree.unionFind(3, new int[][]{{1, 0}, {2, 0}}
    ));

  }

  @Test
  void failureCase24() {
    assertTrue(graphValidTree.isValidTree(2, new int[][]{{1, 0}}
    ));

  }
}