package com.solo.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveDuplictaeElementsInArrayTest {

  RemoveDuplictaeElementsInArray removeDuplictaeElementsInArray;

  @BeforeEach
  void setUp() {
    removeDuplictaeElementsInArray = new RemoveDuplictaeElementsInArray();
  }

  @Test
  void happyTest() {
    int[] input = {1, 1, 2};
    Assertions
        .assertEquals(removeDuplictaeElementsInArray.removeDuplicateElementsInArray(input), 2);
  }

  @Test
  void happyTest2() {
    int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    Assertions
        .assertEquals(removeDuplictaeElementsInArray.removeDuplicateElementsInArray(input), 5);
  }
}