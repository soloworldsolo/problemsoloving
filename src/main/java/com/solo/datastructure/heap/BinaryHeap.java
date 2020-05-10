package com.solo.datastructure.heap;

public class BinaryHeap implements PriorityQueue {

  @Override
  public void buildHeap(int[] input) {
    PriorityQueue.super.buildHeap(input);
  }

  public void insert(int[] input, int value, int index) {

    input[index] = value;
    int parentIndex = (index - 1) >>> 1;

    while (index > 1 && input[index] > input[parentIndex]) {
      PriorityQueue.swap(input, index, parentIndex);
      index = parentIndex;
      parentIndex = (index - 1) >>> 1;

    }

  }


}
