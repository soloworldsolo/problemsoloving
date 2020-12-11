package com.solo.graphtheory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FloydWarshallTest {

  FloydWarshall floydWarshall;

  @BeforeEach
  public void beforeAll() {
    floydWarshall = new FloydWarshall();
  }

  @Test
  public void test_nonnegativeCycle() {
    long[][] input = {{0, 3, Integer.MAX_VALUE, 5},
        {2, 0, Integer.MAX_VALUE, 4}, {
        Integer.MAX_VALUE, 1, 0, Integer.MAX_VALUE
    }, {Integer.MAX_VALUE, Integer.MAX_VALUE, 2, 0}
    };

    assertArrayEquals(floydWarshall.allPairShortestPath(input),
        new long[][]{{0, 3, 7, 5}, {2, 0, 6, 4}, {3, 1, 0, 5}, {5, 3, 2, 0}});
  }

  @Test
  void name() {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MAX_VALUE + 7);
  }
}