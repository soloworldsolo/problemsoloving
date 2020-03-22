package com.solo.algoexpert.easy;

import java.util.Objects;

/**
 * AlgoExpert binary search of an array implementaion in java, implemented using the way binary
 * search is implemented in java collections fran
 */
public class BinarySearch {

  /**
   * uses three pointer mechanism to find the numbers , input has to be sorted returns -1 if the
   * elemnt is not found
   *
   * @return int
   */
  public static int search(int[] input, int target) {
    Objects.requireNonNull(input, "input cannot be empty");
    int startIndex = 0;
    int endIndex = input.length - 1;
    int middleIndex = Math.round(startIndex + endIndex) / 2;
    while (startIndex <= endIndex) {
      if (input[middleIndex] == target) {
        return middleIndex;
      }
      if (input[middleIndex] > target) {
        endIndex = middleIndex - 1;
        middleIndex = Math.round(startIndex + endIndex) / 2;
      } else if (input[middleIndex] < target) {
        startIndex = middleIndex + 1;
        middleIndex = Math.round(startIndex + endIndex) / 2;
      }
    }

    return -1;
  }

}

class BinarySearchTest {

  public static void main(String[] args) {
    System.out.println(BinarySearch.search(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 73));
  }
}
