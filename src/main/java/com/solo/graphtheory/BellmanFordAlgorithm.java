package com.solo.graphtheory;

import java.util.Arrays;

public class BellmanFordAlgorithm {

  public int[] bellmanFordAlgorithm(int vertices, int[][] weightedEdges) {
    int[] result = new int[vertices];
    Arrays.fill(result, 1, vertices, Integer.MAX_VALUE);
    for (int i = 0; i < vertices; i++) {
      relaxEdges(result, weightedEdges);
    }
    return result;
  }

  private void relaxEdges(int[] result, int[][] weightedEdges) {
    for (int[] edgeWeight : weightedEdges) {
      int computedWeight = result[edgeWeight[0]] + edgeWeight[2];
      if (result[edgeWeight[1]] > computedWeight) {
        result[edgeWeight[1]] = computedWeight;
      }
    }
  }
}
