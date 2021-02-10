package com.solo.leetcode.graphtheory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Given an undirected graph, return true if and only if it is bipartite.
 *
 * Recall that a graph is bipartite if we can split its set of nodes into two independent subsets A
 * and B, such that every edge in the graph has one node in A and another node in B.
 *
 * The graph is given in the following form: graph[i] is a list of indexes j for which the edge
 * between nodes i and j exists.  Each node is an integer between 0 and graph.length - 1.  There are
 * no self edges or parallel edges: graph[i] does not contain i, and it doesn't contain any element
 * twice.
 */
public class GraphBipartitate {

  /**
   * BFS approach
   */
  public boolean isBipartitae(int[][] graph) {

    boolean[] visitedSet = new boolean[graph.length];
    Map<Integer, Color> colorMap = new HashMap<>();
    Queue<Integer> edgesQueue = new LinkedList<>();
    for (int i = 0; i < graph.length; i++) {
      colorMap.putIfAbsent(i, Color.GEREY);
    }

    for (int i = 0; i < graph.length; i++) {
      if (visitedSet[i] == false && edgesQueue.isEmpty()) {
        edgesQueue.add(i);
      }
      while (!edgesQueue.isEmpty()) {
        int[] edges = graph[edgesQueue.peek()];
        if (edges.length == 0 || colorMap.get(edgesQueue.peek()) == Color.GEREY) {
          colorMap.put(edgesQueue.peek(), Color.BLACK);
        }
        for (int edge : edges) {
          if (visitedSet[edge]) {
            continue;
          }
          if (ispresentInParentset(colorMap.get(edgesQueue.peek()), edge, colorMap, edgesQueue)) {
            return false;
          }
        }

        visitedSet[edgesQueue.poll()] = true;
      }
    }

    return true;
  }

  private boolean ispresentInParentset(Color parentcolor,
      int edge, Map<Integer, Color> colorMap, Queue<Integer> edgesQueue) {
    if (parentcolor == Color.BLACK) {
      if (colorMap.get(edge) == Color.BLACK) {
        return true;
      }
      colorMap.put(edge, Color.RED);
    }
    if (parentcolor == Color.RED) {
      if (colorMap.get(edge) == Color.RED) {
        return true;
      }
      colorMap.put(edge, Color.BLACK);
    }
    edgesQueue.add(edge);
    return false;
  }

  enum Color {
    GEREY,
    BLACK,
    RED
  }
}