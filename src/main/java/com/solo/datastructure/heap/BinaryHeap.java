package com.solo.datastructure.heap;

import java.util.Objects;

public class BinaryHeap {

  public void buildHeap(int[] input) {
    Objects.requireNonNull(input);
    for (int i = input.length / 2; i >= 0; i--) {
      heapify(input, i);
    }
  }

  private void heapify(int[] input, int i) {
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

  private int getGreaterIndex(int leftIndex, int rightIndex, int[] intput) {
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

  private void swap(int[] input, int currentIndex, int greaterIndex) {
    int temp = input[currentIndex];
    input[currentIndex] = input[greaterIndex];
    input[greaterIndex] = temp;
  }

  public void insert(int[] input, int value, int index) {

    input[index] = value;
    int parentIndex = (index - 1) / 2;

    while (index > 1 && input[index] > input[parentIndex]) {
      swap(input, index, parentIndex);
      index = parentIndex;
      parentIndex = (index - 1) / 2;
    }

  }

}
