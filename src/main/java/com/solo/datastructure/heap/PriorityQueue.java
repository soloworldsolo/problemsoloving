package com.solo.datastructure.heap;

public interface PriorityQueue {

  static int getGreaterIndex(int leftIndex, int rightIndex, int[] intput) {
    if (leftIndex > intput.length - 1) {
      return Integer.MAX_VALUE;
    } else if (rightIndex > intput.length - 1) {
      return leftIndex;
    } else {
      if (intput[leftIndex] > intput[rightIndex]) {
        return leftIndex;
      }
      return rightIndex;
    }
  }

  static void swap(int[] input, int currentIndex, int greaterIndex) {
    int temp = input[currentIndex];
    input[currentIndex] = input[greaterIndex];
    input[greaterIndex] = temp;
  }

  default void heapify(int[] input, int i) {
    int currentIndex = i;
    while (currentIndex < input.length) {
      int greaterIndex = Integer.MAX_VALUE;
      int rightIndex = (2 * currentIndex + 1) + 1;
      int leftIndex = rightIndex - 1;
      greaterIndex = getGreaterIndex(leftIndex, rightIndex, input);
      if (greaterIndex != Integer.MAX_VALUE && input[greaterIndex] > input[currentIndex]) {
        swap(input, currentIndex, greaterIndex);
      }
      currentIndex = greaterIndex;
    }
  }

}
