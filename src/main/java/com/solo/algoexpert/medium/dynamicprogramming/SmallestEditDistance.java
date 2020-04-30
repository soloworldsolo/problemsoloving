package com.solo.algoexpert.medium.dynamicprogramming;

import static java.lang.Math.min;
import static java.util.Objects.requireNonNull;

public class SmallestEditDistance {

  public static int levenshteinDistance(String str1, String str2) {
    requireNonNull(str1);
    requireNonNull(str2);
    int[][] array = new int[str1.length() + 1][str2.length() + 1];
    array[0][0] = 0;
    for (int i = 0; i < str1.length() + 1; i++) {
      for (int j = 0; j < str2.length() + 1; j++) {
        array[i][j] = j;
      }
      array[i][0] = i;
    }

    for (int i = 1; i < str2.length() + 1; i++) {
      for (int j = 1; j < str1.length(); j++) {
        if (str2.charAt(i) == str1.charAt(j)) {
          array[i][j] = array[i - 1][j - 1];
        } else {
          array[i][j] = min(array[i - 1][j], min(array[i - 1][j - 1], array[i][j - 1]));
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    levenshteinDistance("solo", "hello");
  }

}
