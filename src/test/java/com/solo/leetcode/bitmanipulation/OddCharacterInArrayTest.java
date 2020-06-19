package com.solo.leetcode.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OddCharacterInArrayTest {

  OddCharacterInArray oddCharacterInArray;

  @BeforeEach
  void setUp() {
    oddCharacterInArray = new OddCharacterInArray();
  }

  @Test
  void test1() {
    Assertions.assertEquals('e', oddCharacterInArray.oddCharacterInArray("abcd", "abcde"));
  }
}