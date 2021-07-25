package com.solo.leetcode.twopointer;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

  private ValidPalindrome validPalindrome;

  @BeforeEach
  void setUp() {
    validPalindrome = new ValidPalindrome();
  }

  @Test
  void testvalidPalindrome() {
    String input = "A man, a plan, a canal: Panama";
    assertTrue(validPalindrome.isPalidrome(input));
  }
}