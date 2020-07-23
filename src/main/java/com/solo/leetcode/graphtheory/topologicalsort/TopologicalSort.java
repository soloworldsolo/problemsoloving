package com.solo.leetcode.graphtheory.topologicalsort;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopologicalSort {

  public List<Integer> topologicalSort(int vertices, int[][] edges) {
    List<Integer> result = new ArrayList<>();
    boolean[] visited = new boolean[vertices];
    Map<Integer, List<Integer>> adjacencyListMapping = new HashMap<>();
    Deque<Integer> adjacenceyStack = new ArrayDeque<>();
    for (int i = 0; i < edges.length; i++) {
      int[] adjacency = edges[i];
      adjacencyListMapping.putIfAbsent(adjacency[0], new ArrayList<>());
      adjacencyListMapping.get(adjacency[0]).add(adjacency[1]);
    }

    for (int i = 0; i < vertices; i++) {
      if (!visited[i]) {
        depthFirstSearch(adjacencyListMapping, visited, adjacenceyStack, i);
      }
    }
    return result;
  }

  private void depthFirstSearch(Map<Integer, List<Integer>> adjacencyListMapping, boolean[] visited,
      Deque<Integer> stack, int input) {
    visited[input] = true;
    List<Integer> adjacencyList = adjacencyListMapping.get(input);
    if (adjacencyList != null) {
      for (int i = 0; i < adjacencyList.size(); i++) {
        if (!visited[adjacencyList.get(i)]) {
          depthFirstSearch(adjacencyListMapping, visited, stack, adjacencyList.get(i));
        }
      }
    }
    stack.offerFirst(input);
  }

}
