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
      merge(input, startIndex ,endIndex);
    }


  }

  private void merge(int[] input, int startIndex, int endIndex) {
    int total = (endIndex - startIndex) + 1;
    int[] auxillary = new int[total];
    int i = 0;
    int start = startIndex;
    int middle = (start + (endIndex - startIndex) / 2) + 1;
    int end = middle;
    while (i < auxillary.length) {
      if (start < middle &&  end <= endIndex) {
        if (input[start] < input[end]) {
          auxillary[i++] = input[start++];

        } else {
          auxillary[i++] = input[end++];
        }
      } else if (start >= middle && end <= endIndex && i < auxillary.length) {
        auxillary[i++] = input[end++];
      } else if (end >= endIndex && start < middle && i < auxillary.length) {
        auxillary[i++] = input[start++];
      }
    }


    int j = 0;
    int startPosition = startIndex;
    while (j < auxillary.length) {
      input[startPosition++] = auxillary[j++];
    }



  }

  private void swap(int[] input, int firstIndex, int secondIndex) {
    int temp = input[firstIndex];
    int secondValue = input[secondIndex];
    input[secondIndex] = temp;
    input[firstIndex] = secondValue;

  }
}
