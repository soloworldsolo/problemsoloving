package com.solo.algoexpert.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

  private int[] inputArray1 = null;
  private int[] inputArray2 = null;
  private BubbleSort bubbleSort;

  @BeforeEach
  void setUp() {
    bubbleSort = new BubbleSort();
    inputArray1 = new int[]{5, -2, 2, -8, 3, -10, -6, -1, 2, -2, 9, 1, 1};
    inputArray2 = new int[]{5, 1, 4, 2, 8};

  }

  @Test
  void TestCase1() {
    int[] expected = {-10, -8, -6, -2, -2, -1, 1, 1, 2, 2, 3, 5, 9};
    Assertions.assertArrayEquals(bubbleSort.bubbleSort(inputArray1), expected);
  }

  @Test
  void sortSmallInputRange() {
    int[] expected = {1, 2, 4, 5, 8};
    Assertions.assertArrayEquals(bubbleSort.bubbleSort(inputArray2), expected);
  }
}

