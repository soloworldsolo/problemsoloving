package com.solo.leetcode.graphtheory;

/**
 * You are given a map of a server center, represented as a m * n integer matrix grid, where 1 means
 * that on that cell there is a server and 0 means that it is no server. Two servers are said to
 * communicate if they are on the same row or on the same column.
 *
 * Return the number of servers that communicate with any other server.
 */
public class ServersThatCommunicate {

  public int getActiveServerCounts(int[][] grid) {
    int[] row = new int[grid.length];
    int[] column = new int[grid[0].length];
    int count = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1) {
          row[i]++;
          column[j]++;
        }
      }
    }

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1) {
          if (row[i] > 1 || column[j] > 1) {
            count++;
          }
        }
      }
    }
    return count;
  }


}
