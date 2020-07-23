package com.solo.leetcode.graphtheory.traversal;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DepthFirstSearchTest {

  DepthFirstSearch depthFirstSearch;

  @BeforeEach
  void setUp() {
    depthFirstSearch = new DepthFirstSearch();
  }

  @Test
  void name() {
    int[][] input = new int[][]{{0, 1}, {0, 2}, {1, 2}, {2, 0}, {2, 3}, {3, 3}};
    Assertions.assertEquals(List.of(0, 1, 2, 3), depthFirstSearch.depthFirstSearch(4, input));
  }
}