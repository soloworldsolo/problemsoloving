package com.solo.graphtheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CycleDetection {

  public boolean cycleDeetction(int[][] vertices, int vertice) {
    return cycleDeetctionAdjacencyList(vertices, vertice);
  }

  private boolean cycleDeetctionAdjacencyList(int[][] vertices, int noofvertice) {
    Map<Integer, List<Integer>> adjacencyVertices = new HashMap<>();
    for (int[] vertice : vertices) {
      adjacencyVertices.putIfAbsent(vertice[0], new ArrayList<>());
      adjacencyVertices.get(vertice[0]).add(vertice[1]);
    }
    boolean[] visitedEdges = new boolean[noofvertice];
    for (int i = 0; i < noofvertice; i++) {
      if (!visitedEdges[i]) {
        if (isCyclePresent(adjacencyVertices, visitedEdges, i,
            new boolean[noofvertice])) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean isCyclePresent(Map<Integer, List<Integer>> adjacencyVertices,
      boolean[] visitedEdges, int vertice, boolean[] parentverti) {
    if (parentverti[vertice]) {
      return true;

    }
    if (visitedEdges[vertice]) {
      return false;
    }
    visitedEdges[vertice] = true;
    parentverti[vertice] = true;
    List<Integer> vertices = adjacencyVertices.get(vertice);
    if (vertices != null) {
      for (int vert : vertices) {
        if (isCyclePresent(adjacencyVertices, visitedEdges, vert, parentverti)) {
          return true;
        }
      }
    }
    return false;
  }

}
