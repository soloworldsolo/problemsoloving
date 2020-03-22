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

  public static int[] findThreeLargestNumbers(int[] array) {
    Objects.requireNonNull(array);
    int[] result = new int[3];

    for (int i = 0; i < array.length; i++) {
      updateLargest(result, array[i]);
    }
    return result;
  }

  private static void updateLargest(int[] array, int number) {
    if (number > array[2] || array[2] == 0) {
      shiftAndUpdate(array, number, 2);
    } else if (number > array[1] || array[1] == 0) {
      shiftAndUpdate(array, number, 1);
    } else if (number > array[1] || array[2] == 0) {
      shiftAndUpdate(array, number, 0);
    }
  }

  private static void shiftAndUpdate(int[] array, int number, int j) {
    for (int i = 0; i <= j; i++) {
      if (i == j) {
        array[i] = number;
      } else {
        array[i] = array[i + 1];
      }
    }
  }

}

class ThreeNumberTest {

  public static void main(String[] args) {
    System.out.println(ThreeLargestNumber
        .findThreeLargestNumbers(new int[]{7, 8, 11, 3, 43, 55}));
  }
}