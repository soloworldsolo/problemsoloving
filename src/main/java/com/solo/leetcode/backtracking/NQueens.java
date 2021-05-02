package com.solo.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two
 * queens attack each other.
 *
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 *
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and
 * '.' both indicate a queen and an empty space, respectively.
 */
public class NQueens {

  /**
   * @param n number of columns
   * @return List<List < String>> list_of_valid_positions
   */
  public List<List<String>> solveNQueens(int n) {
    char[][] input = new char[n][n];
    List<List<String>> result = new ArrayList<>();
    int[] current = new int[n];
    Arrays.fill(current, -1);
    solveNQueens(input, result, 0, 0, current);
    return result;
  }


  private void solveNQueens(char[][] input, List<List<String>> result, int currentRow,
      int currentColumn, int[] current) {

    if (currentColumn >= input.length || currentColumn < 0) {
      return;
    }

    if (currentColumn == input[0].length - 1 && current[currentColumn] != -1 && validPosition(
        currentColumn, current[currentColumn], current)) {
      result.add(composeList(current));
    }
    int[] nextposition = getNextPosition(input, currentRow, currentColumn, current);
    solveNQueens(input, result, nextposition[0], nextposition[1], current);


  }

  private List<String> composeList(int[] current) {
    List<String> result = new ArrayList<>();
    int currentIndex = 0;
    while (currentIndex < current.length) {
      StringBuilder builder = new StringBuilder();
      for (int i = 0; i < current.length; i++) {
        if (current[currentIndex] == i) {
          builder.append("Q");
        } else {
          builder.append(".");
        }
      }
      currentIndex++;
      result.add(builder.toString());
    }
    return result;
  }


  private int[] getNextPosition(char[][] input, int xposition, int yposition, int[] current) {
    int currentColumnIndex = current[yposition];
    int computedColumIndex = currentColumnIndex + 1;

    while (computedColumIndex < input.length) {
      if (validPosition(yposition, computedColumIndex, current)) {
        current[yposition] = computedColumIndex;
        return new int[]{xposition, yposition == current.length - 1 ? yposition : yposition + 1};
      }
      computedColumIndex++;
    }
    if (yposition == 0 && current[yposition] == current.length - 1) {
      return new int[]{current.length, current.length};
    }
    current[yposition] = -1;
    return new int[]{xposition, yposition - 1};
  }


  private boolean validPosition(int column, int columnIndex, int[] current) {

      int currentIndex = column;
      int currentRowPosition = columnIndex;
      int index = 1;
      while (currentIndex - index >= 0) {
          if (currentRowPosition == current[currentIndex - index]
                  || currentRowPosition - index == current[currentIndex
                  - index] || currentRowPosition + index == current[currentIndex
                  - index]) {
              return false;
          }
          index++;
      }
      return true;
  }

}
