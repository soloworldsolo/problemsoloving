package com.solo.leetcode.graphtheory;

import static java.lang.Math.min;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * You are starving and you want to eat food as quickly as possible. You want to find the shortest
 * path to arrive at any food cell.
 *
 * You are given an m x n character matrix, grid, of these different types of cells:
 *
 * '*' is your location. There is exactly one '*' cell. '#' is a food cell. There may be multiple
 * food cells. 'O' is free space, and you can travel through these cells. 'X' is an obstacle, and
 * you cannot travel through these cells. You can travel to any adjacent cell north, east, south, or
 * west of your current location if there is not an obstacle.
 *
 * Return the length of the shortest path for you to reach any food cell. If there is no path for
 * you to reach food, return -1.
 */
public class ShortestPathForGood {

  public int getFood(char[][] grid) {
    int numberOfRows = grid.length;
    int numberOfColumns = grid[0].length;
    int startingPoint = getStartingPoint(grid);
    Set<Integer> foodset = new HashSet<>();
    Map<Integer, Integer> pathvalues = new HashMap<>();
    if (startingPoint == -1) {
      return -1;
    }
    Queue<Integer> pathQueue = new LinkedList<>();
    int[] visitedSet = new int[numberOfRows * numberOfColumns];
    pathQueue.add(startingPoint);
    int[][] dirs = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    while (!pathQueue.isEmpty()) {
      int xpos = pathQueue.peek() / numberOfColumns;
      int ypos = pathQueue.peek() % numberOfColumns;
      int parentvalue = pathvalues.getOrDefault(getCordinate(xpos, ypos, numberOfColumns), 0);
      for (int i = 0; i < dirs.length; i++) {
        int[] pos = dirs[i];
        int newXpos = xpos + pos[0];
        int newYpos = ypos + pos[1];
        int cordinate = getCordinate(newXpos, newYpos, numberOfColumns);
        if (newXpos >= 0 && newXpos < numberOfRows && newYpos >= 0
            && newYpos < numberOfColumns && visitedSet[cordinate] == 0) {
          final int posn = getCordinate(newXpos, newYpos, numberOfColumns);
          if (grid[newXpos][newYpos] == 'O') {
            pathvalues.put(posn, parentvalue + 1);
            pathQueue.add(posn);

          }
          if (grid[newXpos][newYpos] == '#') {
            return parentvalue + 1;
          }
          visitedSet[posn] = 1;
        }

      }

      pathQueue.poll();
    }
    return foodset.isEmpty() ? -1 : getSmallestPath(foodset, pathvalues);
  }

  private int getCordinate(int xpos, int ypos, int numberOfColumns) {
    return (xpos * numberOfColumns + ypos);
  }

  private int getSmallestPath(Set<Integer> foodset, Map<Integer, Integer> pathValues) {
    int result = Integer.MAX_VALUE;
    for (Integer value : foodset) {
      result = min(result, pathValues.get(value));
    }
    return result;
  }

  private int getStartingPoint(char[][] grid) {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == '*') {
          return i * grid[0].length + j;
        }
      }
    }
    return -1;
  }
}
