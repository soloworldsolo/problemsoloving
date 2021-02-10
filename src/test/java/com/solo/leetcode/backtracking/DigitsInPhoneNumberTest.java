package com.solo.leetcode.backtracking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DigitsInPhoneNumberTest {

  private DigitsInPhoneNumber digitsInPhoneNumber;

  @BeforeEach
  void setUp() {
    digitsInPhoneNumber = new DigitsInPhoneNumber();
  }

  @Test
  void test1() {
    List<String> output = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
    assertEquals(output, digitsInPhoneNumber.letterCombinations("23"));
  }
}