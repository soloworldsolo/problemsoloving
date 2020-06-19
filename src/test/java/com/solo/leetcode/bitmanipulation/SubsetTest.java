package com.solo.leetcode.bitmanipulation;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubsetTest {

  Subset subset;

  @BeforeEach
  void setUp() {
    subset = new Subset();
  }

  @Test
  void name() {
    Assertions.assertEquals(
        List.of(List.of(3), List.of(1), List.of(2), List.of(1, 2, 3), List.of(1, 2), List.of(1, 3),
            List.of(2, 3), List.of()), subset.subsets(new int[]{1, 2, 3}));

  }
}