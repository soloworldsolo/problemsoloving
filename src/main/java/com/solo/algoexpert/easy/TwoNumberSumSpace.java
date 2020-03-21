package com.solo.algoexpert.easy;

import java.util.Arrays;
import java.util.Objects;

public class TwoNumberSumSpace {

  public static void main(String[] args) {
    System.out.println(twoNumberSum(new int[]{4,6,1},5));
  }


  public static int[] twoNumberSum(int[] input, int sum) {
    Objects.requireNonNull(input, "input cannot be empty");
    Arrays.sort(input);
    int startIndex = 0;
    int endIndex = input.length - 1;
    while (startIndex < endIndex) {
      if (input[startIndex] + input[endIndex] == sum) {
        return new int[]{input[startIndex], input[endIndex]};
      } else if (input[startIndex] + input[endIndex] < sum) {
        startIndex++;
      } else if (input[startIndex] + input[endIndex] > sum) {
        endIndex--;
      }
    }
    return new int[0];
  }

}
