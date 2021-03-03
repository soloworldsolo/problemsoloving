package com.solo.leetcode.graphtheory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FloweringPlantTest {

  private FloweringPlant floweringPlant;

  @BeforeEach
  void setUp() {
    floweringPlant = new FloweringPlant();
  }

  @Test
  void test1() {
    int[][] paths = {{1, 2}, {2, 3}, {3, 1}};
    int[] result = {1, 2, 3};
    assertArrayEquals(result, floweringPlant.floweringPlant(3, paths));
  }

  @Test
  void test2() {
    int[][] paths = {{4, 1}, {4, 2}, {4, 3}, {2, 5}, {1, 2}, {1, 5}};
    int[] result = {1, 2, 1, 3, 3};
    assertArrayEquals(result, floweringPlant.floweringPlant(5, paths));
  }

  @Test
  void test3() {
    int[][] paths = {{1, 2}, {2, 3}, {3, 4}, {4, 1}, {1, 3}, {2, 4}};
    int[] result = {1, 2, 3, 4};
    assertArrayEquals(result, floweringPlant.floweringPlant(4, paths));
  }
}