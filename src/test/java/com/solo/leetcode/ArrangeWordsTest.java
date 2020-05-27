package com.solo.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrangeWordsTest {

  ArrangeWords arrangeWords;

  @BeforeEach
  void setUp() {
    arrangeWords = new ArrangeWords();
  }

  @Test
  void testCase1() {
    Assertions.assertEquals("Is cool leetcode", arrangeWords.arrangeWords("Leetcode is cool"));
    Assertions.assertEquals("Is cool leetcode",
        arrangeWords.arrangeWordsPriorityQueue("Leetcode is cool"));

  }

  @Test
  void testCase2() {
    Assertions
        .assertEquals("On and keep calm code", arrangeWords.arrangeWords("Keep calm and code on"));
  }

  @Test
  void testCase3() {
    Assertions.assertEquals("To be or to be not", arrangeWords.arrangeWords("To be or not to be"));
  }
}