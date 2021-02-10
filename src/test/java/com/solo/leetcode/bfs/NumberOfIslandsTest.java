package com.solo.leetcode.bfs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberOfIslandsTest {

  NumberOfIslands numberOfIslands;

  @BeforeEach
  void setUp() {
    numberOfIslands = new NumberOfIslands();
  }

  @Test
  void positiveCaseDfsRecursion() {
    char[][] islands = {{'1', '1', '1', '1', '0' }, {'1', '1', '0', '1', '0' },
        {'1', '1', '0', '0', '0' }, {'0', '0', '0', '0', '0' }};
    assertEquals(1, numberOfIslands.dfs(islands));
  }

  @Test
  void positiveCaseDfsRecursion1() {
    char[][] islands = {{'1', '1', '0', '0', '0' }, {'1', '1', '0', '0', '0' },
        {'0', '0', '1', '0', '0' }, {'0', '0', '0', '1', '1' }};
    assertEquals(3, numberOfIslands.dfs(islands));
  }

  @Test
  void positiveCaseBFSfsRecursion1() {
    char[][] islands = {{'1', '1', '0', '0', '0' }, {'1', '1', '0', '0', '0' },
        {'0', '0', '1', '0', '0' }, {'0', '0', '0', '1', '1' }};
    assertEquals(3, numberOfIslands.bfsIteration(islands));
  }

  @Test
  void positiveCaseBFSIteration() {
    char[][] islands = {{'1', '1', '1', '1', '0' }, {'1', '1', '0', '1', '0' },
        {'1', '1', '0', '0', '0' }, {'0', '0', '0', '0', '0' }};
    assertEquals(1, numberOfIslands.bfsIteration(islands));
  }

  @Test
  void positiveCaseUnionFindIteration() {
    char[][] islands = {{'1', '1', '1', '1', '0' }, {'1', '1', '0', '1', '0' },
        {'1', '1', '0', '0', '0' }, {'0', '0', '0', '0', '0' }};
    assertEquals(1, numberOfIslands.unionFind(islands));
  }


}