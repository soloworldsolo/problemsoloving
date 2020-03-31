package com.solo.algoexpert.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductSumTest {

  ProductSum productSum;

  @BeforeEach
  void setUp() {
    productSum = new ProductSum();
  }

  @Test
  void sanityTest() {
    List<Object> test = new ArrayList<Object>();
    test.add(5);
    test.add(2);
    test.add(Arrays.asList(7,1));
    test.add(3);
    test.add(Arrays.asList(6,Arrays.asList(-13,8),4));
    Assertions.assertEquals(productSum.productSum(test), 15);

  }
}