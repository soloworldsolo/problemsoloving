package com.solo.leetcode;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MajorityElementTwoTest {

  MajorityElementTwo majorityElementTwoTest;

  @BeforeEach
  void setUp() {
    majorityElementTwoTest = new MajorityElementTwo();
  }

  @Test
  void test1() {
    Assertions.assertEquals(List.of(3), majorityElementTwoTest.majorityElement(new int[]{3, 2, 3}));

  }

  @Test
  void test1single() {
    Assertions.assertEquals(List.of(1), majorityElementTwoTest.majorityElement(new int[]{1}));
  }

  @Test
  void test1single1() {
    Assertions.assertEquals(List.of(1, 2), majorityElementTwoTest.majorityElement(new int[]{1, 2}));
  }


}