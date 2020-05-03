package com.solo.datastructure.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HeapSortTest {

  HeapSort heapSort;

  @Test
  void happyCase() {
    int[] input = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
    heapSort.heapSort(input);
    Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 7, 8, 9, 10, 14, 16}, input);
  }

  @BeforeEach
  void setUp() {
    heapSort = new HeapSort();
  }
}