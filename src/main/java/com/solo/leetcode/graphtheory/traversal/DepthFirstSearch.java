package com.solo.leetcode.graphtheory.traversal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * implementation of depth first search
 */

public class DepthFirstSearch {

  public List<Integer> depthFirstSearch(int vertices, int[][] edges) {
    List<Integer> result = new ArrayList<>();
    Map<Integer, List<Integer>> edge = new HashMap<>();
    boolean[] visitedarray = new boolean[vertices];
    for (int i = 0; i < edges.length; i++) {
      int[] eldge = edges[i];
      edge.putIfAbsent(eldge[0], new ArrayList<>());
      edge.get(eldge[0]).add(eldge[1]);
    }
    for (int i = 0; i < vertices; i++) {
      depthFirstSearch(visitedarray, edge, result, i);
    }

    return result;
  }

  private void depthFirstSearch(boolean[] visitedarray, Map<Integer, List<Integer>> edge,
      List<Integer> result, int i) {
    if (!visitedarray[i]) {
      visitedarray[i] = true;
      result.add(i);
      List<Integer> edges = edge.get(i);
      if (edges != null && !edges.isEmpty()) {
        for (int j = 0; j < edges.size(); j++) {
          depthFirstSearch(visitedarray, edge, result, j);
        }
      }
    }

  }

}
