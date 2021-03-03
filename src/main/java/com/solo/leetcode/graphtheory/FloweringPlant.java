package com.solo.leetcode.graphtheory;

public class FloweringPlant {

  public int[] floweringPlant(int n, int[][] paths) {
    int[] result = new int[n];
    int[] color = new int[n + 1];

    colorGraph(1, color, paths);

    System.arraycopy(color, 1, result, 0, result.length);
    return result;
  }

  private void colorGraph(int index,
      int[] color, int[][] paths) {
    if (index == color.length) {
      return;
    }

    for (int j = 1; j <= 4; j++) {

      if (color[index] == 0 && validColor(index, j, color, paths)) {
        color[index] = j;
        colorGraph((index + 1), color, paths);
        break;
      }

    }

  }

  private boolean validColor(int i, int j, int[] colors, int[][] paths) {
    for (int[] path : paths) {
      if (path[0] == i && j == colors[path[1]]) {
        return false;
      }
      if (path[1] == i && j == colors[path[0]]) {
        return false;
      }
    }
    return true;
  }


}
