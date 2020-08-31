package com.solo.leetcode.graphtheory.topologicalsort;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopologicalSortTest {

  TopologicalSort topologicalSort;

  @BeforeEach
  void setUp() {
    topologicalSort = new TopologicalSort();
  }

  @Test
  void TestCase1() {
    Assertions.assertEquals(List.of(5, 4, 2, 3, 1, 0), topologicalSort
        .topologicalSort(6, new int[][]{{5, 0}, {5, 2}, {4, 0}, {4, 1}, {2, 3}, {3, 1}}));
  }

  @Test
  void TestCase2() {
    Assertions.assertEquals(List.of(0, 2, 1, 3, 4, 5), topologicalSort
        .topologicalSort(6,
            new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}, {3, 5}, {2, 5}, {2, 3}, {3, 4}}));
  }
}