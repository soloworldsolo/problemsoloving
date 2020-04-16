package com.solo.algoexpert.medium.dynamicprogramming;

import java.util.Arrays;
import java.util.Objects;

/**
 * Write a function that takes in two non-empty arrays of integers. The function should find the
 * pair of numbers (one from the first array, one from the second array) whose absolute difference
 * is closest to zero. The function should return an array containing these two numbers, with the
 * number from the first array in the first position. Assume that there will only be one pair of
 * numbers with the smallest difference.
 */
public class SmallDifferenceArray {

  public int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    Objects.requireNonNull(arrayOne);
    Objects.requireNonNull(arrayTwo);
    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);
    int index1;
    int index2;
    int minValue = Integer.MAX_VALUE;
    int computedIndex = Integer.MAX_VALUE;
    int currentIndexOne = 0;
    int currentIndexTwo = 0;
    int[] result = null;
    while ((currentIndexOne < arrayOne.length && (currentIndexTwo < arrayTwo.length))) {
      index1 = arrayOne[currentIndexOne];
      index2 = arrayTwo[currentIndexTwo];
      if ((index1 < index2)) {
        computedIndex = index2 - index1;
        currentIndexOne++;
      } else if (index2 < index1) {
        computedIndex = index1 - index2;
        currentIndexTwo++;
      } else {
        return new int[]{index1, index2};
      }
      if (minValue > computedIndex) {
        minValue = computedIndex;
        result = new int[]{index1, index2};
      }
    }
    return result;

  }

}