package com.solo.leetcode.bfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MineSweeperTest {

  private MineSweeper mineSweeper;

  @BeforeEach
  void setUp() {
    mineSweeper = new MineSweeper();
  }

  @Test
  void testPositiveCase() {
    char[][] input = {{'E', 'E', 'E', 'E', 'E' }, {'E', 'E', 'M', 'E', 'E' },
        {'E', 'E', 'E', 'E', 'E' }, {'E', 'E', 'E', 'E', 'E' }};
    int[] click = {3, 0};
    char[][] output = {{'B', '1', 'E', '1', 'B' }, {'B', '1', 'M', '1', 'B' },
        {'B', '1', '1', '1', 'B' }, {'B', 'B', 'B', 'B', 'B' }};
    Assertions.assertArrayEquals(output, mineSweeper.bfsIteration(input, click));
  }

  @Test
  void failedCase() {
    char[][] input = {{'E' }};
    int[] click = {0, 0};
    char[][] output = {{'B' }};
    Assertions.assertArrayEquals(output, mineSweeper.bfsIteration(input, click));
  }

  @Test
  public void testPositiveCaseDfsRecursion() {
    char[][] input = {{'E', 'E', 'E', 'E', 'E' }, {'E', 'E', 'M', 'E', 'E' },
        {'E', 'E', 'E', 'E', 'E' }, {'E', 'E', 'E', 'E', 'E' }};
    int[] click = {3, 0};
    char[][] output = {{'B', '1', 'E', '1', 'B' }, {'B', '1', 'M', '1', 'B' },
        {'B', '1', '1', '1', 'B' }, {'B', 'B', 'B', 'B', 'B' }};
    Assertions.assertArrayEquals(output, mineSweeper.dfsRecursion(input, click));
  }

  @Test
  public void testPositiveCaseDfsIteration() {
    char[][] input = {{'E', 'E', 'E', 'E', 'E' }, {'E', 'E', 'M', 'E', 'E' },
        {'E', 'E', 'E', 'E', 'E' }, {'E', 'E', 'E', 'E', 'E' }};
    int[] click = {3, 0};
    char[][] output = {{'B', '1', 'E', '1', 'B' }, {'B', '1', 'M', '1', 'B' },
        {'B', '1', '1', '1', 'B' }, {'B', 'B', 'B', 'B', 'B' }};
    Assertions.assertArrayEquals(output, mineSweeper.dfsIteration(input, click));
  }
}