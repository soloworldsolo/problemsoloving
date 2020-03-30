package com.solo.algoexpert.medium;

/**
 * Write a function that takes in an array of positive integers and returns an integer representing
 * the maximum sum of non-adjacent elements in the array. If a sum cannot be generated, the function
 * should return 0.
 */
public class NoAdjacentElements {

  /**
   * uses dynamic programming approach to find the maximum sum
   * @param array
   * @return int maximum elemnt
   */
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

  /**
   * returns the maximum value between two integers
   * @param i
   * @param i1
   * @return int
   */
  private static int maxValue(int i, int i1) {
    Math.max(i,i1);
    return (i > i1) ? i : i1;
  }


}

class NoAdjacentElemntsTest {

  public static void main(String[] args) {
    int[] value = new int[]{7,10,12,7,9,14};
    NoAdjacentElements.maxSubsetSumNoAdjacent(value);
  }
}
