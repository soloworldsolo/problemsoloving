package com.solo.graphtheory;

import static java.util.Objects.nonNull;

public class FloydWarshall {

  public long[][] allPairShortestPath(long[][] input) {
    nonNull(input);
    int i = 0;
    while (i < input.length) {
      for (int j = 0; j < input.length; j++) {
        for (int k = 0; k < input.length; k++) {
          if (j != k && j != i && k != i) {
            input[j][k] = Math.min(input[j][k], (input[i][k]) + (input[j][i]));
          }
        }
      }
      i++;
    }
    return input;

  }

}
