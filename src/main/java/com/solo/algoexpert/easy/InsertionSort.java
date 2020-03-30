package com.solo.algoexpert.easy;

import java.util.Objects;

/**
 * implementaion of insertion sort
 */
public class InsertionSort {

  public int[] insertionSort(int[] array) {
    Objects.requireNonNull(array);
    int sortedPosition = 0;
    while (sortedPosition < array.length) {
      for (int i = sortedPosition; i > 0; i--) {
        if(array[i-1] > array[i]) {
          swap(array, i, i - 1);
        }
      }
      sortedPosition++;
    }
    return array;
  }

  private void swap(int[] array, int i, int i1) {
    int temp = array[i1];
    array[i1] = array[i];
    array[i] = temp;
  }

}
