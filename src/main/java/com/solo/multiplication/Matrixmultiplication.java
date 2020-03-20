package com.solo.multiplication;

import java.util.Objects;

public class Matrixmultiplication {

  /*
     multiples two matrix and returns the result
     assumes both the matrix are of the same size
     (i.e) square matrix
     @param1 expects a  non empty two dimensional matrix , throws null pointer exception
     @param2 expects a non empty two  dimensional matrix
   */
  public int[][] multiply(final int[][] matrix1, final int[][] matrix2) {
    final int[][] first = Objects.requireNonNull(matrix1, "matrix1 should not be empty");
    final int[][] second = Objects.requireNonNull(matrix2, "matrix2 should not be empty");

    int[][] result = new int[first.length][second[0].length];

    int resultrowindex = 0;
    int resultcolumnindex = 0;

    while (resultrowindex < result.length) {
      while (resultcolumnindex < result[0].length && resultcolumnindex < first.length) {
        result[resultrowindex][resultcolumnindex] = compute(first, second, resultrowindex,
            resultcolumnindex);
        resultcolumnindex++;
      }

      resultrowindex++;
      resultcolumnindex = 0;
    }

    return result;
  }

  private int compute(final int[][] first, final int[][] second, final int resultrowindex,
      final int resultcolumnindex) {
    int res = 0;
    int index = 0;
    while (index < first[resultrowindex].length) {
      res += first[resultrowindex][index] * second[index][resultcolumnindex];
      index++;
    }

    return res;
  }
}
