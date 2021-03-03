package com.solo.leetcode.backtracking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NQueensTest {

  NQueens nQueens;

  @BeforeEach
  void setUp() {
    nQueens = new NQueens();
  }

  @Test
  public void test1() {
    List<List<String>> solution = List
        .of(List.of(".Q..", "...Q", "Q...", "..Q."), List.of("..Q.", "Q...", "...Q", ".Q.."));
    assertEquals(solution, nQueens.solveNQueens(4));
  }

  @Test
  public void test5Queens() {
    List<List<String>> solution = List.of(
        List.of("Q....", "..Q..", "....Q", ".Q...", "...Q."),
        List.of("Q....", "...Q.", ".Q...", "....Q", "..Q.."),
        List.of(".Q...", "...Q.", "Q....", "..Q..", "....Q")
        , List.of(".Q...", "....Q", "..Q..", "Q....", "...Q."),
        List.of("..Q..", "Q....", "...Q.", ".Q...", "....Q")
        , List.of("..Q..", "....Q", ".Q...", "...Q.", "Q...."),
        List.of("...Q.", "Q....", "..Q..", "....Q", ".Q..."),
        List.of("...Q.", ".Q...", "....Q", "..Q..", "Q...."),
        List.of("....Q", ".Q...", "...Q.", "Q....", "..Q.."),
        List.of("....Q", "..Q..", "Q....", "...Q.", ".Q..."));
    assertEquals(solution, nQueens.solveNQueens(5));
  }

  @Test
  public void test1Queens() {
    List<List<String>> solution = List.of(
        List.of("Q"));

    assertEquals(solution, nQueens.solveNQueens(1));
  }
}