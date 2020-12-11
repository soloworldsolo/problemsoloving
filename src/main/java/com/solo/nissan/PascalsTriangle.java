package com.solo.nissan;

import java.util.Objects;

public class PascalsTriangle {

  /**
   * takes an empty two dimensional array and
   *
   * @return return a two dimewnsional array of output
   */
  public int[][] pascalTrainagle(int[][] input) {
    Objects.requireNonNull(input);
    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < input.length; j++) {
        if (i != 0 || j != 0) {
          input[i][j] = getBoundCheck(input, i - 1, j) + getBoundCheck(input, i - 1, j - 1);
        }
      }
    }
    return input;
  }

  private int getBoundCheck(int[][] input, int i, int j) {
    if ((i < 0) || j < 0 || j > input.length - 1) {
      return 0;
    }
    return input[i][j];
  }

}
