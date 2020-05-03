package com.solo.algoexpert.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

  PalindromeNumber palindromeNumber;

  @Test
  void happyCase() {
    palindromeNumber = new PalindromeNumber();
    Assertions.assertTrue(palindromeNumber.palindromeNumber(121));
  }

  @Test
  void failCase() {
    palindromeNumber = new PalindromeNumber();
    Assertions.assertFalse(palindromeNumber.palindromeNumber(157));

    String Solo = "solomon";
    int index = Solo.indexOf("mon");
    System.out.println(index);
  }


}