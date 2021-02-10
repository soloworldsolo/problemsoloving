package com.solo.leetcode.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Given an n x n grid containing only values 0 and 1, where 0 represents water and 1 represents
 * land, find a water cell such that its distance to the nearest land cell is maximized, and return
 * the distance. If no land or water exists in the grid, return -1.
 *
 * The distance used in this problem is the Manhattan distance: the distance between two cells (x0,
 * y0) and (x1, y1) is |x0 - x1| + |y0 - y1|.
 */
public class FarFromLand {

  /**
   * BFS method
   *
   * @return int maximum distance
   */
  public int farFromLand(int[][] grid) {
    int numOfRows = grid.length;
    int numberOfColumn = grid[0].length;
    int[] resultArray = new int[numberOfColumn * numOfRows];
    Arrays.fill(resultArray, 0);
    boolean[] visitedSet = new boolean[numberOfColumn * numOfRows];
    Queue<Integer> coordinateQueue = new LinkedList<>();
    for (int i = 0; i < numOfRows; i++) {
      for (int j = 0; j < numberOfColumn; j++) {
        if (grid[i][j] == 1) {
          visitedSet[i * numberOfColumn + j] = true;
          coordinateQueue.add(i * numberOfColumn + j);
        }
      }
    }
    int maxValue = 0;
    while (!coordinateQueue.isEmpty()) {
      int position = coordinateQueue.poll();
      int newXposition = position / numberOfColumn;
      int newYposition = position % numberOfColumn;
      int parentValue = resultArray[newXposition * numberOfColumn + newYposition];
      int[][] adjacentList = new int[][]{
          {newXposition - 1, newYposition}, {newXposition + 1, newYposition},
          {newXposition, newYposition - 1}, {newXposition, newYposition + 1}
      };
      for (int[] adjacent : adjacentList) {
        int xpos = adjacent[0];
        int ypos = adjacent[1];
        if (xpos >= 0 && xpos < numOfRows && ypos >= 0 && ypos < numberOfColumn &&
            !isVisitedValue(visitedSet, xpos, ypos, numberOfColumn)) {
          resultArray[xpos * numberOfColumn + ypos] = parentValue + 1;
          maxValue = Math.max(maxValue, (parentValue + 1));
          visitedSet[xpos * numberOfColumn + ypos] = true;
          coordinateQueue.add(xpos * numberOfColumn + ypos);
        }
      }
    }

    return maxValue > 0 ? maxValue : -1;
  }


  private boolean isVisitedValue(boolean[] resultArray, int xpos, int ypos, int numberOfColumns) {
    return resultArray[xpos * numberOfColumns + ypos];
  }

  private void BFSTraversl(int[][] grid, int[] resultArray, boolean[] visitedSet,
      Queue<Integer> coordinateQueue,
      int xpos, int ypos) {

    if ((xpos > 0 && grid[xpos - 1][ypos] == 1) || (xpos < grid[0].length - 1
        && grid[xpos + 1][ypos] == 1) ||
        (ypos > 0 && grid[xpos][ypos - 1] == 1) || (ypos < grid[0].length
        && grid[xpos][ypos] == 1)) {
      resultArray[xpos * grid[0].length + ypos] = 1;
      visitedSet[xpos * grid[0].length + ypos] = true;
      if (xpos > 0 && !visitedSet[((xpos - 1) * grid[0].length) + ypos]
          && grid[xpos - 1][ypos] != 1) {
        coordinateQueue.add(xpos - 1 * grid[0].length + ypos);
      }
      if (ypos > 0 && !visitedSet[((xpos) * grid[0].length) + ypos + 1]
          && grid[xpos][ypos + 1] != 1) {
        coordinateQueue.add(xpos * grid[0].length + ypos - 1);
      }
      if (ypos > grid[0].length - 1 && !visitedSet[((xpos) * grid[0].length) + ypos + 1]
          && grid[xpos + 1][ypos] != 1) {
        coordinateQueue.add(xpos * grid[0].length + ypos + 1);
      }
    } else {

    }


  }
}
