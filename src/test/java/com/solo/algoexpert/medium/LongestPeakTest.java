package com.solo.algoexpert.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestPeakTest {

  LongestPeak longestPeak;

  @Test
  void sanityTest() {
    longestPeak = new LongestPeak();
    var input = new int[]{1, 2, 3, 3,4,0,10,6,5,-1,-3,2,3};
    var expected = 6;
    Assertions.assertEquals(longestPeak.longestPeak(input), expected);
  }
  @Test
  void sanityTest2() {
    longestPeak = new LongestPeak();
    var input = new int[]{1,1,3,2,1};
    var expected = 4;
    Assertions.assertEquals(longestPeak.longestPeak(input), expected);
  }
  @Test
  void testCase1() {
    longestPeak = new LongestPeak();
    var input = new int[] {5, 4, 3, 2, 1, 2, 10, 12, -3, 5, 6, 7, 10};
    var expected = 5;
    Assertions.assertEquals(expected,longestPeak.longestPeak(input));
  }
  @Test
  void testCaseZero() {
    longestPeak = new LongestPeak();
    var input = new int[] {1, 2, 3, 4, 5, 6, 10, 100, 1000};
    var expected = 0;
    Assertions.assertEquals(expected,longestPeak.longestPeak(input));
  }
}