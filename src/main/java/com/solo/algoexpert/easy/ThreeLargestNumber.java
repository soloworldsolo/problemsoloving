package com.solo.algoexpert.easy;

import java.util.Objects;

/**
 * ​ Find Three Largest Numbers ​ Write a function that takes in an array of integers and returns a
 * sorted array of the three largest integers in the input array. Note that the function should
 * return duplicate integers if necessary; for example, it should return [10, 10, 12] for an input
 * array of [10, 5, 9, 10, 12]. ​ Sample input: [141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7] Sample
 * output: [18, 141, 541] ​ Input:Your Solution Our Solution
 *
 *
 * Questions List
 */
public class ThreeLargestNumber {

  public int[] findThreeLargestNumbers(int[] array) {
    Objects.requireNonNull(array);
    int[] result = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

    for (int i : array) {
      updateLargest(result, i);
    }
    return result;
  }

  private void updateLargest(int[] result, int i) {
    if (i > result[2]) {
      shiftAndAdd(result, i, 2);
    } else if (i > result[1]) {
      shiftAndAdd(result, i, 1);
    } else if (i > result[0]) {
      shiftAndAdd(result, i, 0);
    }
  }

  private void shiftAndAdd(int[] result, int number, int index) {
    for (int i = 0; i < index; i++) {
      result[i] = result[i + 1];
    }
    result[index] = number;
  }


}

