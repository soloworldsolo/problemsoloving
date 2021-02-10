package com.solo.leetcode.backtracking;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GenerateParenthisisTest {

  private GenerateParenthisis generateParenthisis;

  @BeforeEach
  void setUp() {
    generateParenthisis = new GenerateParenthisis();
  }

  @Test
  void test1() {
    List<String> result = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
    Assertions.assertEquals(result, generateParenthisis.generateParenthisis(3));
  }
}