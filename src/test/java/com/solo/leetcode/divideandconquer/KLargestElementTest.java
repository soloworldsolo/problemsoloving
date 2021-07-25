package com.solo.leetcode.divideandconquer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KLargestElementTest {

  private KLargestElement kLargestElement;

  @BeforeEach
  void setUp() {
    kLargestElement = new KLargestElement();
  }


  @Test
  void test1() {
    int[] input = new int[]{3, 2, 1, 5, 6, 4};
    assertEquals(3, kLargestElement.kthLargestElement(input, 3));
  }
}