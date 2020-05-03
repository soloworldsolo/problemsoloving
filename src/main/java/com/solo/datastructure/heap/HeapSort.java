package com.solo.datastructure.heap;

public class HeapSort implements PriorityQueue {

  public void heapSort(int[] input) {
    buildHeap(input);
    int endIndex = input.length - 1;
    while (endIndex > 0) {
      PriorityQueue.swap(input, 0, endIndex);
      heapify(input, 0, --endIndex);

    }
  }


}
