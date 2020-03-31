package com.solo.algoexpert.medium;

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

  public  int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    Objects.requireNonNull(arrayOne);
    Objects.requireNonNull(arrayTwo);
    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);
    int minIndex1 ;
    int minIndex2 ;
    int minValue = Integer.MAX_VALUE;
    int computedIndex = Integer.MAX_VALUE;
    int currentIndexOne = 0;
    int currentIndexTwo = 0;
    int[] result =null;
    while ((currentIndexOne < arrayOne.length && (currentIndexTwo < arrayTwo.length))) {
      minIndex1 = arrayOne[currentIndexOne];
      minIndex2 = arrayTwo[currentIndexTwo];
      if ((minIndex1 < minIndex2)) {
        computedIndex = minIndex2 - minIndex1;
        currentIndexOne++;
      } else if (minIndex2 < minIndex1) {
        computedIndex = minIndex1 - minIndex2;
        currentIndexTwo++;
      } else {
        return new int[]{minIndex1, minIndex2};
      }
      if (minValue > computedIndex) {
        minValue = computedIndex;
        result = new int[] {minIndex1,minIndex2};
      }
    }
    return  result;

  }

}

