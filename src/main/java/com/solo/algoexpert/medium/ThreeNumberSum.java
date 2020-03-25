package com.solo.algoexpert.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ​Write a function that takes in a non-empty array of distinct integers and an integer
 * representing a target sum. The function should find all triplets in the array that sum up to the
 * target sum and return a two-dimensional array of all these triplets. The numbers in each triplet
 * should be ordered in ascending order, and the triplets themselves should be ordered in ascending
 * order with respect to the numbers they hold. If no three numbers sum up to the target sum, the
 * function should return an empty array.
 */
public class ThreeNumberSum {

  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    List<Integer[]> result = new ArrayList<>();
    Arrays.sort(array);

    for (int i = 0; i < array.length; i++) {

      int startIndex = i + 1;
      int endIndex = array.length - 1;
      while (startIndex < endIndex) {
        int computedSum = array[i] + array[startIndex] + array[endIndex];
        if (computedSum == targetSum) {
          result.add(new Integer[]{array[i], array[startIndex], array[endIndex]});
          startIndex++;
          endIndex--;
        } else if (computedSum < targetSum) {
          startIndex++;
        } else if (computedSum > targetSum) {
          endIndex--;
        }
      }
    }
    return result;
  }
}

class ThreenumberTestr {

  public static void main(String[] args) {
    List<Integer[]> expected = new ArrayList<Integer[]>();
    expected.add(new Integer[]{-2, 10, 49});
    List<Integer[]> output = ThreeNumberSum.threeNumberSum(new int[]{8, 10, -2, 49, 14}, 57);
  }

}
