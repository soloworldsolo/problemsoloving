package com.solo.projectfang.competetiveprogramming.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitToNumberTest {
 private DigitToNumber digitToNumber;

 @BeforeEach
 void setUp() {
  digitToNumber = new DigitToNumber();
 }

 @Test
 void test1() {
  assertEquals("two seven eight ",digitToNumber.convertToString(278));
 }


}