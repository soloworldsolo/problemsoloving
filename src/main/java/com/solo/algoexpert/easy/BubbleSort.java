package com.solo.algoexpert.easy;

import java.util.Objects;

/**
 * implementaion of  bubble sort
 */
public class BubbleSort {

  /**
   * sorts the arary by comparing the current index with the next index if the current index is
   * graeter swapping has to be done, sorting is done in palce
   *
   * @return arary
   */
  public int[] bubbleSort(int[] array) {
    Objects.requireNonNull(array, "input cannot be empty");
    int startIndex = 0;
    boolean isSwaped;
    int maximumIndex = array.length;
    for (int i = startIndex; i < array.length - 1; i++) {
      int j = 0;
      isSwaped = false;
      while (j < maximumIndex - 1) {
        if (array[j] > array[j + 1]) {
          isSwaped = true;
          swap(array, j, j + 1);
        }
        j++;
      }
      if(!isSwaped) {
        return array;
      }
      maximumIndex -= 1;
    }

    return array;
  }

  /**
   * swaps the position of the elements in the array
   */
  private void swap(int[] array, int i, int i1) {
    int temp = array[i1];
    array[i1] = array[i];
    array[i] = temp;

  }

}
