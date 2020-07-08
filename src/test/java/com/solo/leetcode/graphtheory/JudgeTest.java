package com.solo.leetcode.graphtheory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JudgeTest {

  Judge judge;

  @BeforeEach
  void setUp() {
    judge = new Judge();
  }

  @Test
  void name() {

    Assertions.assertEquals(2, judge.findJudge(2, new int[][]{{1, 2}}));
  }

  @Test
  void name2() {

    Assertions
        .assertEquals(3, judge.findJudge(4, new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}}));

  }

  @Test
  void name3() {

    Assertions.assertEquals(1, judge.findJudge(1, new int[][]{}));

  }

  @Test
  void FailedTestCase() {

    Assertions.assertEquals(-1, judge.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}));

  }
}