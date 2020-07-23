package com.solo.graphtheory;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DijikstraShortestPath {

  public int[] shortestPath(int vertices, int[][] edges, int[][] weights) {
    Map<Integer, PriorityQueue<Integer>> verticesEdgeLookup = new HashMap<>();
    int[] res
    for (int i = 0; i < edges.length; i++) {
      int[] edgePath = edges[i];
      verticesEdgeLookup.putIfAbsent(edgePath[0], new PriorityQueue<>());
      verticesEdgeLookup.get(edgePath[0]).add(edgePath[1]);
    }
  }

}
