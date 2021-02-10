package com.solo.leetcode.graphtheory.dfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Given the edges of a directed graph where edges[i] = [ai, bi] indicates there is an edge between
 * nodes ai and bi, and two nodes source and destination of this graph, determine whether or not all
 * paths starting from source eventually, end at destination, that is:
 *
 * At least one path exists from the source node to the destination node If a path exists from the
 * source node to a node with no outgoing edges, then that node is equal to destination. The number
 * of possible paths from source to destination is a finite number. Return true if and only if all
 * roads from source lead to destination.
 */
public class SourceDestination {

  /**
   * @return boolean
   */
  public boolean leadsToDestination(int numberOfNodes, int[][] edges, int source, int destination) {
    Objects.requireNonNull(edges);
    Map<Integer, List<Integer>> adjacencyList = getAdjacencyList(edges);
    Set<Integer> visitedSet = new HashSet<>();
    Set<Integer> visingSet = new HashSet<>();
    Map<Integer, Integer> parentMap = new HashMap<>();
    Deque<Integer> nodeStack = new ArrayDeque<>();

    parentMap.put(source, null);
    Integer cueentNode = source;
    while (cueentNode != null || !nodeStack.isEmpty()) {
      if (visingSet.contains(cueentNode)) {
        return false;
      }

      List<Integer> adjacenc = adjacencyList.getOrDefault(cueentNode, new ArrayList<>());
      if (adjacenc.isEmpty()) {
        if (cueentNode != destination) {
          return false;
        }
      }
      visingSet.add(cueentNode);
      if (!visitedSet.contains(cueentNode)) {
        for (Integer edge : adjacenc) {
          if (cueentNode == edge || parentMap.get(cueentNode) == edge) {
            return false;
          }
          nodeStack.push(edge);
          parentMap.put(edge, cueentNode);
        }
      }

      if (!nodeStack.isEmpty() && visingSet.contains(nodeStack.peek())) {
        visingSet.remove(nodeStack.peek());
        visitedSet.add(nodeStack.peek());
      }
      cueentNode = nodeStack.isEmpty() ? null : nodeStack.pop();


    }
    return true;
  }

  ;

  public boolean leadsToDestinationWorking(int n, int[][] edges, int source, int destination) {
    List<Integer>[] graph = buildDigraph(n, edges);
    return leadsToDest(graph, source, destination, new Color[n]);
  }

  private boolean leadsToDest(List<Integer>[] graph, int node, int dest, Color[] states) {

    // If the state is GRAY, this is a backward edge and hence, it creates a loop.
    if (states[node] != null) {
      return states[node] == Color.BLACK;
    }

    // If this is a leaf node, it should be equal to the destination.
    if (graph[node].isEmpty()) {
      return node == dest;
    }

    // Now, we are processing this node. So we mark it as GRAY
    states[node] = Color.GRAY;

    for (int next : graph[node]) {

      // If we get a `false` from any recursive call on the neighbors, we short circuit and return from there.
      if (!leadsToDest(graph, next, dest, states)) {
        return false;
      }
    }

    // Recursive processing done for the node. We mark it BLACK
    states[node] = Color.BLACK;
    return true;
  }

  private List<Integer>[] buildDigraph(int n, int[][] edges) {
    List<Integer>[] graph = new List[n];
    for (int i = 0; i < n; i++) {
      graph[i] = new ArrayList<>();
    }

    for (int[] edge : edges) {
      graph[edge[0]].add(edge[1]);
    }

    return graph;
  }

  private Map<Integer, List<Integer>> getAdjacencyList(int[][] edges) {
    Map<Integer, List<Integer>> adjacencyMap = new HashMap<>();
    for (int[] edge : edges) {
      var adjacencyList = adjacencyMap.getOrDefault(edge[0], new ArrayList<>());
      adjacencyList.add(edge[1]);
      adjacencyMap.putIfAbsent(edge[0], adjacencyList);
    }
    return adjacencyMap;
  }

  enum Color {GRAY, BLACK}
}
