package com.solo.leetcode.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaximumProductWordLengthTest {

  MaximumProductWordLength maximumProductWordLength;

  @BeforeEach
  void setUp() {
    maximumProductWordLength = new MaximumProductWordLength();
  }

  @Test
  void name() {

    Assertions
        .assertEquals(16, maximumProductWordLength.maximumProduct(new String[]{"abcw",
            "baz", "foo", "xtfn", "abcef",
            "bar"}));
  }
}
