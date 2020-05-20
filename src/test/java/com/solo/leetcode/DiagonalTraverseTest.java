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
        .of(List.of(14, 12, 19, 16, 9), List.of(13, 14, 15, 8, 11), List.of(11, 13, 1));

    Assertions.assertArrayEquals(new int[]{14, 13, 12, 11, 14, 19, 13, 15, 16, 1, 8, 9, 11},
        diagonalTraverse.findDiagonalOrder(input));
  }

  @Test
  void failedTestWrongAnswer1() {
    var input = List
        .of(List.of(1, 2, 3, 4, 5, 6));

    Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6},
        diagonalTraverse.findDiagonalOrder(input));
  }

  @Test
  void failedTestWrongAnswer2() {
    var input = List
        .of(List.of(6, 19, 1, 16, 9), List.of(9, 13, 4, 8, 19), List.of(8, 18, 11, 20, 18),
            List.of(9, 9, 15, 12));

    Assertions.assertArrayEquals(
        new int[]{6, 9, 19, 8, 13, 1, 9, 18, 4, 16, 9, 11, 8, 9, 15, 20, 19, 12, 18},
        diagonalTraverse.findDiagonalOrder(input));
  }

  @Test
  void failedTestWrongAnswer3() {
    var input = List
        .of(List.of(1, 36, 9, 7, 4, 20, 1, 7), List.of(11, 27, 7, 38, 32, 17, 13),
            List.of(35, 16, 7, 7, 21, 13), List.of(5, 40, 27, 37, 26),
            List.of(12, 17, 2, 3, 17, 9, 6, 4), List.of(29, 5, 19, 37, 4, 7, 34, 32, 9),
            List.of(13, 34, 20, 24, 32));

    Assertions.assertArrayEquals(
        new int[]{1, 11, 36, 35, 27, 9, 5, 16, 7, 7, 12, 40, 7, 38, 4, 29, 17, 27, 7, 32, 20, 13, 5,
            2, 37, 21, 17, 1, 34, 19, 3, 26, 13, 13, 7, 20, 37, 17, 24, 4, 9, 32, 7, 6, 34, 4, 32,
            9},
        diagonalTraverse.findDiagonalOrder(input));
  }

  @Test
  void failedTestWrongAnswer4() {
    var input = List
        .of(List.of(35, 20, 24, 2, 14, 16, 20), List.of(27, 25, 2, 36, 23, 31, 10, 1),
            List.of(31, 23, 8, 26, 27, 16), List.of(26, 30, 35, 17, 13, 12, 12, 14, 34, 20),
            List.of(30, 20, 36, 27, 1, 2, 27), List.of(32, 24, 2, 29, 3),
            List.of(39, 14, 28, 8, 8, 9, 29, 30, 20), List.of(30, 13, 39, 16, 8, 21, 2, 5, 3),
            List.of(7, 14, 28, 18, 3));

    Assertions.assertArrayEquals(
        new int[]{35, 27, 20, 31, 25, 24, 26, 23, 2, 2, 30, 30, 8, 36, 14, 32, 20, 35, 26, 23, 16,
            39, 24, 36, 17, 27, 31, 20, 30, 14, 2, 27, 13, 16, 10, 7, 13, 28, 29, 1, 12, 1, 14, 39,
            8, 3, 2, 12, 28, 16, 8, 27, 14, 18, 8, 9, 34, 3, 21, 29, 20, 2, 30, 5, 20, 3},
        diagonalTraverse.findDiagonalOrder(input));
  }
}