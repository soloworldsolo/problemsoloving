package com.solo.leetcode.backtracking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CombinationSumTest {

  private CombinationSum combinationSum;

  @BeforeEach
  void setUp() {
    combinationSum = new CombinationSum();
  }

  @Test
  void test1() {
    var result = List.of(List.of(2, 2, 3), List.of(7));
    assertEquals(result, combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7));
  }
}