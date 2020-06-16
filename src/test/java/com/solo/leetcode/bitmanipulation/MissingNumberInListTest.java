package com.solo.leetcode.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MissingNumberInListTest {

  MissingNumberInList missingNumberInList;

  @BeforeEach
  void setUp() {
    missingNumberInList = new MissingNumberInList();
  }

  @Test
  void test1() {
    Assertions.assertEquals(2, missingNumberInList.missingNumber(new int[]{0, 1, 3}));
  }

  @Test
  void missing8() {
    Assertions
        .assertEquals(8, missingNumberInList.missingNumber(new int[]{0, 1, 3, 2, 5, 7, 9, 4, 6}));

  }
}