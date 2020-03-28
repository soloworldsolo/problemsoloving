package com.solo.algoexpert.medium;

/**
 * Write a function that takes in an array of positive integers and returns an integer representing
 * the maximum sum of non-adjacent elements in the array. If a sum cannot be generated, the function
 * should return 0.
 */
public class NoAdjacentElements {

  public static int maxSubsetSumNoAdjacent(int[] array) {
    if (array.length == 0) {
      return 0;
    } else if (array.length == 1) {
      return array[0];
    } else if (array.length == 2) {
      return maxValue(array[0], array[1]);
    } else {
      int first = array[0];
      int second = maxValue(array[0], array[1]);
      for (int j = 2; j < array.length; j++) {
        int computedValue = first + array[j];
        first = second;
        second = maxValue(computedValue, second);
      }
      return second;
    }

  }

  private static int maxValue(int i, int i1) {
    return (i > i1) ? i : i1;
  }


}

class NoAdjacentElemntsTest {

  public static void main(String[] args) {
    int[] value = new int[]{1, 2, 3};
    NoAdjacentElements.maxSubsetSumNoAdjacent(value);
  }
}
