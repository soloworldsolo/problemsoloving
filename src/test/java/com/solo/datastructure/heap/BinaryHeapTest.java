package com.solo.datastructure.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryHeapTest {

  BinaryHeap binaryHeap;

  @BeforeEach
  void setUp() {
    binaryHeap = new BinaryHeap();
  }

  @Test
  void poitiveCaseHeapify() {
    int[] result = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
    int[] input = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
    binaryHeap.buildHeap(input);
    Assertions.assertArrayEquals(result, input);

  }

  @Test
  void heapInsertion() {
    int[] input = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1, -1};
    binaryHeap.insert(input, 15, 10);
    Assertions.assertArrayEquals(new int[]{16, 15, 10, 8, 14, 9, 3, 2, 4, 1, 7}, input);
  }

  @Test
  void poitiveCaseHeapifyYoutube() {
    int[] result = {70, 30, 50, 12, 20, 35};
    int[] input = {20, 30, 35, 12, 70, 50};
    binaryHeap.buildHeap(input);
    Assertions.assertArrayEquals(result, input);

  }
}