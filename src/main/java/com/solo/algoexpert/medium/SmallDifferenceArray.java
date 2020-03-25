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

  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
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
      minValue = computedIndex;
      if ((minIndex1 < minIndex2)) {
        computedIndex = minIndex2 - minIndex1;
        currentIndexOne++;
      } else if (minIndex2 < minIndex1) {
        computedIndex = minIndex1 - minIndex2;
        currentIndexTwo++;
      } else {
        result = new int[]{minIndex1, minIndex2};
      }
      if (minValue > computedIndex) {
        minValue = computedIndex;
        result = new int[] {minIndex1,minIndex2};
      }
    }
    return  result;

  }

}

class TestSmallDifferenceArray {

  public static void main(String[] args) {
    int[] expected = {20, 17};
    int[] result=SmallDifferenceArray
        .smallestDifference(new int[]{-1, 5, 10, 20, 3},
            new int[]{26, 134, 135, 15, 17});
  }
}