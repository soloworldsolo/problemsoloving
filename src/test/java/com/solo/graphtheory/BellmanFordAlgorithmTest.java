package com.solo.graphtheory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BellmanFordAlgorithmTest {

  BellmanFordAlgorithm bellmanFordAlgorithm;

  @BeforeEach
  void setUp() {
    bellmanFordAlgorithm = new BellmanFordAlgorithm();
  }

  @Test
  void bellmanFordTest() {
    Assertions.assertArrayEquals(new int[]{0, -1, 2, -2, 1}, bellmanFordAlgorithm
        .bellmanFordAlgorithm(5,
            new int[][]{{0, 1, -1}, {0, 2, 4}, {1, 2, 3}, {1, 3, 2}, {1, 4, 2}, {3, 2, 5},
                {3, 1, 1}, {4, 3, -3}}));
  }

  @Test
  void bellmanFordJAvaTpointTest() {
    Assertions.assertArrayEquals(new int[]{0, 3, 5, 2, 5}, bellmanFordAlgorithm
        .bellmanFordAlgorithm(5,
            new int[][]{{0, 1, 6}, {0, 2, 5}, {1, 3, -1}, {3, 4, 3}, {2, 4, 3}, {2, 3, 4},
                {2, 1, -2}}));
  }
}