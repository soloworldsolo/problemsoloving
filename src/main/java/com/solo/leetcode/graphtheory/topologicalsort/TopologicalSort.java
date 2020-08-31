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
    for (int[] adjacency : edges) {
      adjacencyListMapping.putIfAbsent(adjacency[0], new ArrayList<>());
      adjacencyListMapping.get(adjacency[0]).add(adjacency[1]);
    }

    for (int i = 0; i < vertices; i++) {
      if (!visited[i]) {
        depthFirstSearch(adjacencyListMapping, visited, adjacenceyStack, i);
      }
    }
    stackToArary(result, adjacenceyStack);
    return result;
  }

  private void stackToArary(List<Integer> result, Deque<Integer> adjacenceyStack) {
    while (!adjacenceyStack.isEmpty()) {
      result.add(adjacenceyStack.poll());
    }
  }

  private void depthFirstSearch(Map<Integer, List<Integer>> adjacencyListMapping, boolean[] visited,
      Deque<Integer> stack, int input) {
    visited[input] = true;
    List<Integer> adjacencyList = adjacencyListMapping.get(input);
    if (adjacencyList != null) {
      for (Integer integer : adjacencyList) {
        if (!visited[integer]) {
          depthFirstSearch(adjacencyListMapping, visited, stack, integer);
        }
      }
    }
    stack.offerFirst(input);
  }

}
