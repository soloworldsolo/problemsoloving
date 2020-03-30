package com.solo.algoexpert.easy;

import java.util.Objects;

/**
 * implementation of selectio sort
 */
public class SelectionSort {

  public int[] selectionSort(int[] array) {
    Objects.requireNonNull(array);
    for (int i = 0; i < array.length; i++) {
      int j = i + 1;
      int smallestIndex = i;
      while (j < array.length) {
        if (array[j] < array[i] && array[smallestIndex] > array[j]) {
          smallestIndex = j;
        }
        j++;
      }
      if (smallestIndex != i) {
        swap(array, i, smallestIndex);
      }
    }
    return array;
  }

  private void swap(int[] array, int i, int smallestIndex) {
    int temp = array[smallestIndex];
    array[smallestIndex] = array[i];
    array[i] = temp;
  }
}
