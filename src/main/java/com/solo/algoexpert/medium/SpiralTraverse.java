package com.solo.algoexpert.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * traversing the two dimensional array
 */
public class SpiralTraverse {

  public List<Integer> spiralTraverse(int[][] array) {
    List<Integer> result = new ArrayList<>();

    int startRow = 0;
    int endRow = array.length - 1;
    int startColumn = 0;
    int endColumn = array[0].length - 1;

    while (startRow <= endRow && startColumn <= endColumn) {
      for (int i = startColumn; i <= endColumn; i++) {
        result.add(array[startRow][i]);
      }
      startRow++;
      if (startRow > endRow) {
        break;
      }
      for (int j = startRow; j <= endRow; j++) {
        result.add(array[j][endColumn]);
      }
      endColumn--;
        if(startColumn> endColumn) {
          break;
        }
        for (int k = endColumn; k >= startColumn; k--) {
          result.add(array[endRow][k]);
        }


      endRow--;

        for (int l = endRow; l >= startRow; l--) {
          result.add(array[l][startColumn]);
        }


      startColumn++;
    }
    return result;
  }

}
