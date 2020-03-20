package com.solo.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeSortTest {

  MergeSort sort;

  @BeforeEach
  void setUp() {
    sort = new MergeSort();
  }

  @Test
  void geekforgeeks() {
    int[] inputarray = {38, 27, 43, 3, 9, 82, 10};
    int[] resultarary = sort.sort(inputarray);
    int[] expectedarray = {3, 9, 10, 27, 38, 43, 82};
    Assertions.assertArrayEquals(resultarary, expectedarray, "mege sort has failed");
  }

  @Test
  void tutorialspoint() {
    int[] inputarray = {14, 33, 27, 10, 35, 19, 42, 44};
    int[] resultarary = sort.sort(inputarray);
    int[] expectedarray = {10, 14, 19, 27, 33, 35, 42, 44};
    Assertions.assertArrayEquals(resultarary, expectedarray, "mege sort has failed");
  }

  @Test
  void wikipedia() {
    int[] inputarray = {6, 5, 3, 7, 8, 1, 2, 4};
    int[] resultarary = sort.sort(inputarray);
    int[] expectedarray = {1, 2, 3, 4, 5, 6, 7, 8};
    Assertions.assertArrayEquals(resultarary, expectedarray, "mege sort has failed");
  }
}