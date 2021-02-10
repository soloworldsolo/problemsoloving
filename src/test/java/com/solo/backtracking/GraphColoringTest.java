package com.solo.backtracking;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GraphColoringTest {

  private GraphColoring graphColoring;

  @BeforeEach
  void setUp() {
    graphColoring = new GraphColoring();
  }

  @Test
  void test1() {
    int[][] input = {{0, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 0, 1, 0}};

    assertTrue(graphColoring.canColor(input, 3));

  }
}