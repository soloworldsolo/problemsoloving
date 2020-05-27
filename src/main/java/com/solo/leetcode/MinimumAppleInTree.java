package com.solo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumAppleInTree {


  public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
    Map<Integer, List<Integer>> adjacentSet = new HashMap<>();
    boolean[] visitedNodes = new boolean[n];
    Arrays.fill(visitedNodes, false);
    visitedNodes[0] = true;
    for (int i = 0; i < edges.length; i++) {
      adjacentSet.computeIfAbsent(edges[i][0], ArrayList::new);
      List<Integer> adjacentEdgeSet = adjacentSet.get(edges[i][0]);
      adjacentEdgeSet.add(edges[i][1]);
    }

    return dfs(adjacentSet, visitedNodes, edges, hasApple, n);
  }

  private int dfs(Map<Integer, List<Integer>> adjacentSet, boolean[] visitedNodes, int[][] edges,
      List<Boolean> hasApple, int n) {
    int count = 0;
    for (Map.Entry<Integer, List<Integer>> nodeSet : adjacentSet.entrySet()) {
      int i = 0;
      int maximumEdges = nodeSet.getValue().size();
      while (i < maximumEdges) {
        int parentNode = nodeSet.getKey();
        if (!visitedNodes[parentNode] && hasApple.get(parentNode)) {
          count += 2;
        }
        if (i < nodeSet.getValue().size()) {
          int node = nodeSet.getValue().get(i);
          if (hasApple.get(node)) {
            count += 2;
            visitedNodes[node] = true;
            while (parentNode > 0) {
              for (int j = 0; j < edges.length; j++) {
                if (edges[j][1] == parentNode) {
                  if (!visitedNodes[parentNode]) {
                    count += 2;
                    visitedNodes[parentNode] = true;
                  }
                  parentNode = edges[j][0];
                }
              }
            }
          }
        }
        i++;
      }
    }
    return count;
  }


}
