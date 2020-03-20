package com.solo.hackerrank;

import java.util.List;
import java.util.Objects;

/**
 *
 */
public class DiagonalDifference {

  public static int diagonalDifference(List<List<Integer>> arr) {

    Objects.requireNonNull(arr);

    int rows = arr.size();

    int i = 0;
    int j = arr.size() - 1;
    int diagonalCount = 0;
    int reverseDialogcount = 0;

    while (i < rows) {
      int result = arr.get(i).get(i);
      diagonalCount += result;
      i++;
    }
    i = 0;
    while (j > -1) {
      int result = arr.get(j).get(i);
      reverseDialogcount += result;
      j--;
      i++;
    }
    return Math.abs((diagonalCount - reverseDialogcount));

  }


}
