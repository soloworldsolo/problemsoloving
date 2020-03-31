package com.solo.algoexpert.medium;

/**
 *
 */
public class MonotonicArray {

  public boolean isMonotonic(int[] array) {

    int currentIndex = 0;
    int endIndex = array.length - 1;
    boolean isAscending = array[currentIndex] < array[endIndex];
    while (currentIndex < endIndex) {
      if (isAscending) {
        if (array[currentIndex] > array[currentIndex + 1]) {
          return false;
        }
      } else {
        if (array[currentIndex] < array[currentIndex + 1]) {
          return false;
        }
      }
      currentIndex++;
    }
    return true;

  }
}