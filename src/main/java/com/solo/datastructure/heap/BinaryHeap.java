package com.solo.datastructure.heap;

import java.util.Objects;

public class BinaryHeap implements PriorityQueue {

  public void buildHeap(int[] input) {
    Objects.requireNonNull(input);
    for (int i = input.length >>> 1; i >= 0; i--) {
      heapify(input, i);
    }
  }

  public void insert(int[] input, int value, int index) {

    input[index] = value;
    int parentIndex = (index - 1) / 2;

    while (index > 1 && input[index] > input[parentIndex]) {
      PriorityQueue.swap(input, index, parentIndex);
      index = parentIndex;
      parentIndex = (index - 1) / 2;
    }

  }

}
