package com.solo.graphtheory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DijikstraShortestPathTest {

  DijikstraShortestPath dijikstraShortestPath;

  @BeforeEach
  void setUp() {
    dijikstraShortestPath = new DijikstraShortestPath();
  }

  @Test
  void testDijikstraEightNoCycleNonegativeNodes() {
    int[][] input = {{0, 4, 0, 0, 0, 0, 0, 8, 0},
        {4, 0, 8, 0, 0, 0, 0, 11, 0},
        {0, 8, 0, 7, 0, 4, 0, 0, 2},
        {0, 0, 7, 0, 9, 14, 0, 0, 0},
        {0, 0, 0, 9, 0, 10, 0, 0, 0},
        {0, 0, 4, 14, 10, 0, 2, 0, 0},
        {0, 0, 0, 0, 0, 2, 0, 1, 6},
        {8, 11, 0, 0, 0, 0, 1, 0, 7},
        {0, 0, 2, 0, 0, 0, 6, 7, 0}};
    int[] result = {0, 4, 12, 19, 21, 11, 9, 8, 14};
    Assertions.assertArrayEquals(result, dijikstraShortestPath.shortestPath(9, input));

  }
}