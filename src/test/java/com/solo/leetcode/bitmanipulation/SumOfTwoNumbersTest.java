package com.solo.leetcode.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumOfTwoNumbersTest {

  SumOfTwoNumbers sumOfTwoNumbers;

  @BeforeEach
  void setUp() {
    sumOfTwoNumbers = new SumOfTwoNumbers();
  }

  @Test
  void fourPlusThree() {
    Assertions.assertEquals(7, sumOfTwoNumbers.sumOfTwoNumbers(4, 3));
  }

  @Test
  void minusTwoPlusThree() {
    Assertions.assertEquals(1, sumOfTwoNumbers.sumOfTwoNumbers(-2, 3));
  }

}