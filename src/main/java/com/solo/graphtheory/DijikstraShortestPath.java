package com.solo.graphtheory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DijikstraShortestPath {

  /**
   * finding the shortest path using dijiksta algorithm, using adjacencey matrix to represnt the
   * graph so that weights and edges are represented in a single structure
   *
   * @return array of integers shortest path of all vertices
   */
  public int[] shortestPath(int vertices, int[][] edges) {

    int[] result = new int[vertices];
    boolean[] visitedEdges = new boolean[vertices];
    Arrays.fill(result, 1, vertices, Integer.MAX_VALUE);
    Map<Integer, List<Integer>> adjacencyEdges = new HashMap<>();
    for (int i = 0; i < edges.length; i++) {
      int[] edge = edges[i];
      adjacencyEdges.put(i,
          IntStream.range(0, edge.length).filter(index -> edge[index] > 0).boxed()
              .collect(Collectors.toList()));

    }
    relaxEdges(edges, adjacencyEdges, result, visitedEdges, 0);
    return result;
  }

  private void relaxEdges(int[][] edges, Map<Integer, List<Integer>> adjacencyEdges, int[] result,
      boolean[] visitedEdges, int vertice) {

    List<Integer> edgeVertices = adjacencyEdges.get(vertice);
    visitedEdges[vertice] = true;
    for (int edge : edgeVertices) {
      int computedWeight = result[vertice] + edges[vertice][edge];
      if (computedWeight < result[edge]) {
        result[edge] = computedWeight;
      }

    }

    Integer minedge = calculateMinimumedge(result, visitedEdges);
    if (minedge != -1) {
      relaxEdges(edges, adjacencyEdges, result, visitedEdges, minedge);
    }
  }

  private Integer calculateMinimumedge(int[] result, boolean[] visitedEdges) {
    int minEdge = Integer.MAX_VALUE;
    int index = -1;
    for (int i = 0; i < result.length; i++) {
      if (!visitedEdges[i] && result[i] < minEdge) {
        minEdge = result[i];
        index = i;
      }
    }
    return index;
  }


}


