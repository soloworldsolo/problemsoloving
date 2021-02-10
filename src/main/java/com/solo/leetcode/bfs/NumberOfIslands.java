package com.solo.leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {


  public int dfs(char[][] islands) {
    int rows = islands.length;
    int columns = islands[0].length;
    int numberOfIslands = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (islands[i][j] == '1') {
          numberOfIslands++;
          dfsRecursionHelper(islands, i, j);
        }
      }
    }
    return numberOfIslands;
  }

  private void dfsRecursionHelper(char[][] islands, int rowPosition, int columnPosition) {
    if (rowPosition < 0 || rowPosition >= islands.length || columnPosition < 0
        || columnPosition >= islands[0].length || (
        Character.compare('0', islands[rowPosition][columnPosition]) == 0)) {
      return;
    }
    islands[rowPosition][columnPosition] = '0';
    dfsRecursionHelper(islands, rowPosition - 1, columnPosition);
    dfsRecursionHelper(islands, rowPosition + 1, columnPosition);
    dfsRecursionHelper(islands, rowPosition, columnPosition - 1);
    dfsRecursionHelper(islands, rowPosition, columnPosition + 1);

  }

  public int dfsIteration(char[][] islands) {
    return -1;
  }

  public int bfsIteration(char[][] grid) {
    int result = 0;
    Queue<Integer> adjacencyQueue = new LinkedList<>();
    Queue<Integer> backingQueue = new LinkedList<>();
    int rows = grid.length;
    int columns = grid[0].length;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (grid[i][j] == '1') {
          result++;
          adjacencyQueue.add(i);
          backingQueue.add(j);
          while (!adjacencyQueue.isEmpty()) {
            int firstDegree = adjacencyQueue.poll();
            int secondDegree = backingQueue.poll();
            grid[firstDegree][secondDegree] = '0';
            if ((firstDegree - 1) >= 0 && (firstDegree - 1 < rows)
                && grid[firstDegree - 1][secondDegree] == '1') {
              adjacencyQueue.add(firstDegree - 1);
              backingQueue.add(secondDegree);
            }
            if ((firstDegree + 1) >= 0 && (firstDegree + 1 < rows)
                && grid[firstDegree + 1][secondDegree] == '1') {
              adjacencyQueue.add(firstDegree + 1);
              backingQueue.add(secondDegree);
            }
            if ((secondDegree - 1 >= 0) &&
                (secondDegree - 1 < columns) && grid[firstDegree][secondDegree - 1] == '1') {
              adjacencyQueue.add(firstDegree);
              backingQueue.add(secondDegree - 1);
            }
            if ((secondDegree + 1 >= 0) &&
                (secondDegree + 1 < columns) && grid[firstDegree][secondDegree + 1] == '1') {
              adjacencyQueue.add(firstDegree);
              backingQueue.add(secondDegree + 1);
            }

          }
        }
      }
    }
    return result;
  }

  public int unionFind(char[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }
    int nr = grid.length;
    int nc = grid[0].length;
    UnionFind uf = new UnionFind(grid);
    for (int r = 0; r < nr; ++r) {
      for (int c = 0; c < nc; ++c) {
        if (grid[r][c] == '1') {
          grid[r][c] = '0';
          if (r - 1 >= 0 && grid[r - 1][c] == '1') {
            uf.union(r * nc + c, (r - 1) * nc + c);
          }
          if (r + 1 < nr && grid[r + 1][c] == '1') {
            uf.union(r * nc + c, (r + 1) * nc + c);
          }
          if (c - 1 >= 0 && grid[r][c - 1] == '1') {
            uf.union(r * nc + c, r * nc + c - 1);
          }
          if (c + 1 < nc && grid[r][c + 1] == '1') {
            uf.union(r * nc + c, r * nc + c + 1);
          }
        }
      }
    }
    return uf.count;
  }

  static class UnionFind {

    int count; // # of connected components
    int[] parent;
    int[] rank;

    public UnionFind(char[][] grid) { // for problem 200
      count = 0;
      int m = grid.length;
      int n = grid[0].length;
      parent = new int[m * n];
      rank = new int[m * n];
      for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j) {
          if (grid[i][j] == '1') {
            parent[i * n + j] = i * n + j;
            ++count;
          }
          rank[i * n + j] = 0;
        }
      }
    }

    public int find(int i) { // path compression
      if (parent[i] != i) {
        parent[i] = find(parent[i]);
      }
      return parent[i];
    }

    public void union(int x, int y) { // union with rank
      int rootx = find(x);
      int rooty = find(y);
      if (rootx != rooty) {
        if (rank[rootx] > rank[rooty]) {
          parent[rooty] = rootx;
        } else if (rank[rootx] < rank[rooty]) {
          parent[rootx] = rooty;
        } else {
          parent[rooty] = rootx;
          rank[rootx] += 1;
        }
        --count;
      }
    }

    public int getCount() {
      return count;
    }
  }
}
