package com.solo.nissan;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PascalsTriangleTest {

  PascalsTriangle pascalsTriangle;


  @BeforeEach
  void setUp() {
    pascalsTriangle = new PascalsTriangle();
  }

  @Test
  public void testFiveByFive() {

    var input = new int[5][5];
    input[0][0] = 1;

    var output = new int[][]{
        {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 2, 1, 0, 0}, {1, 3, 3, 1, 0}, {1, 4, 6, 4, 1}
    };
    assertArrayEquals(output, pascalsTriangle.pascalTrainagle(input));
  }
}