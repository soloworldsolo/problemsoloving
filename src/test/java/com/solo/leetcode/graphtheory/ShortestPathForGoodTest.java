package com.solo.leetcode.graphtheory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShortestPathForGoodTest {

  ShortestPathForGood shortestPathForGood;


  @BeforeEach
  void setUp() {
    shortestPathForGood = new ShortestPathForGood();
  }


  @Test
  void test1() {
    char[][] grid = {{'X', 'X', 'X', 'X', 'X', 'X' }, {'X', '*', 'O', 'O', 'O', 'X' },
        {'X', 'O', 'O', '#', 'O', 'X' }, {'X', 'X', 'X', 'X', 'X', 'X' }};
    assertEquals(3, shortestPathForGood.getFood(grid));
  }

  @Test
  void test2() {
    char[][] grid = {{'X', 'X', 'X', 'X', 'X' }, {'X', '*', 'X', 'O', 'X' },
        {'X', 'O', 'X', '#', 'X' }, {'X', 'X', 'X', 'X', 'X' }};
    assertEquals(-1, shortestPathForGood.getFood(grid));
  }
}