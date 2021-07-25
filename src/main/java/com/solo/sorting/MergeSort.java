package com.solo.sorting;

import static java.util.Objects.requireNonNull;

public class MergeSort {

  public static void main(String[] args) {
    MergeSort sort = new MergeSort();
    int[] inputarray = {14, 33, 27, 10, 35, 19, 42, 44};
    sort.sort(inputarray);
  }

  public int[] sort(int[] iterable) {
    var input = requireNonNull(iterable);
    int[] des = new int[input.length];

    split(input, 0, input.length - 1);
    return iterable;
  }

  private void split(int[] input, int startIndex, int endIndex) {
    if (startIndex < endIndex) {
      int middle = startIndex + (endIndex - startIndex) / 2;
      split(input, startIndex, middle);
      split(input, middle + 1, endIndex);
      merge(input, startIndex, middle, endIndex);
    }


  }

  private void merge(int[] input, int startIndex, int middleIndex, int endIndex) {
    int numOfelements = (endIndex - startIndex) + 1;
    int middle = startIndex + (endIndex - startIndex) / 2;

    int[] destination = new int[numOfelements];
    System.arraycopy(input, startIndex, destination, 0, numOfelements);
    int i = 0;
    int j = middle;
    int k = startIndex;

    while (i <= middle && j < endIndex) {
      if (destination[i] < destination[j]) {
        input[k++] = destination[i++];
      } else {
        input[k++] = destination[j++];
      }
    }

    while (i <= middle) {

      input[k++] = destination[i++];

    }

    while (j < numOfelements) {

      input[k++] = destination[j++];

    }

  }

  private void swap(int[] input, int firstIndex, int secondIndex) {
    int temp = input[firstIndex];
    int secondValue = input[secondIndex];
    input[secondIndex] = temp;
    input[firstIndex] = secondValue;

  }
}
