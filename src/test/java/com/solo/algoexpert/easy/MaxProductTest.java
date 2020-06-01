package com.solo.algoexpert.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxProductTest {

  MaxProduct maxProduct;

  @BeforeEach
  void setUp() {
    maxProduct = new MaxProduct();
  }

  @Test
  void maxProduct() {
    Assertions.assertEquals(12, maxProduct.maxProduct(new int[]{3, 4, 5, 2}));
  }

  @Test
  void maxProduct1() {
    Assertions.assertEquals(16, maxProduct.maxProduct(new int[]{1, 5, 4, 5}));
  }

  @Test
  void maxProduct2() {
    Assertions.assertEquals(12, maxProduct.maxProduct(new int[]{3, 7}));
  }
}