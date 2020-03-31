package com.solo.algoexpert.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ThreeLargestNumberTest {

  ThreeLargestNumber threeLargestNumber;

  @BeforeEach
  void setUp() {
    threeLargestNumber = new ThreeLargestNumber();
  }

  @Test
  void negativeCase() {
    int[] expected = {-2,-1 ,7};
    int[] input = {-1, -2, -3, -7, -17, -27, -18, -541, -8, -7, 7};
    Assertions.assertArrayEquals(threeLargestNumber.findThreeLargestNumbers(input),expected);
  }

  @Test
  void Testcase1() {
   int[] input=new int[] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
   int[] expected = new int[] {18,141,541};
   Assertions.assertArrayEquals(threeLargestNumber.findThreeLargestNumbers(input),expected);
  }

  @Test
  void sanityTest() {
    int[] expected = {10,10,12};
    int[] input = {10,5,9,10,12};
    Assertions.assertArrayEquals(threeLargestNumber.findThreeLargestNumbers(input),expected);
  }
}