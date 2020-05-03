package com.solo.datastructure.heap;

public interface PriorityQueue {

  static int getGreaterIndex(int currentIndex, int maximumIndex, int[] input) {
    int greaterIndex = currentIndex;
    int rightIndex = (2 * currentIndex + 1) + 1;
    int leftIndex = rightIndex - 1;
    if (maximumIndex >= leftIndex && input[leftIndex] > input[greaterIndex]) {
      greaterIndex = leftIndex;
    }
    if (maximumIndex >= rightIndex && input[rightIndex] > input[greaterIndex]) {
      return rightIndex;
    }
    if (greaterIndex == currentIndex) {
      return Integer.MAX_VALUE;
    }
    return greaterIndex;
  }

  default void buildHeap(int[] input) {
    for (int i = input.length >>> 1; i >= 0; i--) {
      heapify(input, i);
    }
  }

  static void swap(int[] input, int currentIndex, int greaterIndex) {
    int temp = input[currentIndex];
    input[currentIndex] = input[greaterIndex];
    input[greaterIndex] = temp;
  }

  default void heapify(int[] input, int i) {
    heapify(input, i, input.length - 1);
  }

  default void heapify(int[] input, int i, int maximumIndex) {
    int currentIndex = i;
    while (currentIndex < maximumIndex) {

      int greaterIndex = getGreaterIndex(currentIndex, maximumIndex, input);
      if (greaterIndex != Integer.MAX_VALUE && input[greaterIndex] > input[currentIndex]) {
        swap(input, currentIndex, greaterIndex);
      }
      currentIndex = greaterIndex;
    }
  }

}
