package com.solo.algoexpert.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

  InsertionSort insertionSort;

  @BeforeEach
  void setUp() {
    insertionSort = new InsertionSort();
  }

  @Test
  void sanityTest() {
    int[] expected = {4, 3, 2, 10, 12, 1, 5, 6};
    int[] result = {1, 2, 3, 4, 5, 6, 10, 12};
    Assertions.assertArrayEquals(insertionSort.insertionSort(expected), result);
  }

  @Test
  void TestCase1() {
    int[] expected = {-10, -8, -6, -2, -2, -1, 1, 1, 2, 2, 3, 5, 9};
    int[] input = {5, -2, 2, -8, 3, -10, -6, -1, 2, -2, 9, 1, 1};
    Assertions.assertArrayEquals(insertionSort.insertionSort(input), expected);
  }

  @Test
  void TestCase2() {
    int[] expected = {
        -10, -10, -9, -9, -9, -8, -8, -6, -4, -4, -4, -2, -1, 0, 0, 0, 0, 1, 1, 2, 2, 4, 4, 5, 5, 7,
        8, 8, 9, 10
    };
    int[] input = {
        2, -2, -6, -10, 10, 4, -8, -1, -8, -4, 7, -4, 0, 9, -9, 0, -9, -9, 8, 1, -4, 4, 8, 5, 1, 5,
        0,
        0, 2, -10
    };
    Assertions.assertArrayEquals(insertionSort.insertionSort(input),expected);
  }
}