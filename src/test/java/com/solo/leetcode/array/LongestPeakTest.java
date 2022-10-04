package com.solo.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestPeakTest {

  LongestPeak longestPeak;

  @BeforeEach
  void setUp() {
    longestPeak = new LongestPeak();
  }


  @Test
  void testcase1() {
    assertEquals(2, longestPeak.findPeakElement(new int[]{1, 2, 3, 1}));
    assertEquals(2, longestPeak.binarySearchSolution(new int[]{1, 2, 3, 1}));
  }

  @Test
  void testcase2() {
    assertEquals(1, longestPeak.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    assertEquals(1, longestPeak.binarySearchSolution(new int[]{1, 2, 1, 3, 5, 6, 4}));
  }

  @Test
  void testcase3() {
    assertEquals(2, longestPeak.findPeakElement(new int[]{1, 2, 3, 1}));
    assertEquals(2, longestPeak.binarySearchSolution(new int[]{1, 2, 3, 1}));
  }
  @Test
  void testcase5() {
    assertEquals(0, longestPeak.findPeakElement(new int[]{-2147483647,-2147483648}));
  }

  @Test
  void testcase4() {
    assertEquals(1, longestPeak.findPeakElement(new int[]{1, 2,}));
    assertEquals(1, longestPeak.binarySearchSolution(new int[]{1, 2,}));
  }


}