package com.solo.leetcode;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiagonalTraverseTest {

  DiagonalTraverse diagonalTraverse;

  @BeforeEach
  void setUp() {
    diagonalTraverse = new DiagonalTraverse();
  }

  @Test
  void squaredMatrixTest() {
    var input = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));

    Assertions.assertArrayEquals(new int[]{1, 4, 2, 7, 5, 3, 8, 6, 9},
        diagonalTraverse.findDiagonalOrder(input));
  }

  @Test
  void NonSquareMatrixMatrixTest() {
    var input = List.of(List.of(1, 2, 3, 4, 5), List.of(6, 7), List.of(8), List.of(9, 10, 11),
        List.of(12, 13, 14, 15, 16));

    Assertions.assertArrayEquals(new int[]{1, 6, 2, 8, 7, 3, 9, 4, 12, 10, 5, 13, 11, 14, 15, 16},
        diagonalTraverse.findDiagonalOrder(input));
  }

  @Test
  void NonSquareMatrixMatrixTestfail1() {
    var input = List
        .of(List.of(1, 2, 3), List.of(4), List.of(5, 6, 7), List.of(8), List.of(9, 10, 11));

    Assertions.assertArrayEquals(new int[]{1, 4, 2, 5, 3, 8, 6, 9, 7, 10, 11},
        diagonalTraverse.findDiagonalOrder(input));
  }

  @Test
  void NonSquareMatrixMatrixTestfail2() {
    var input = List
        .of(List.of(6), List.of(8), List.of(6, 1, 6, 16));

    Assertions.assertArrayEquals(new int[]{6, 8, 6, 1, 6, 16},
        diagonalTraverse.findDiagonalOrder(input));
  }

  @Test
  void failedTestWrongAnswer() {
    var input = List
        .of(List.of(14, 12, 19, 6, 9), List.of(13, 14, 15, 8, 11), List.of(11, 13, 1));

    Assertions.assertArrayEquals(new int[]{14, 13, 12, 11, 14, 19, 13, 15, 16, 1, 8, 9, 11},
        diagonalTraverse.findDiagonalOrder(input));
  }
}