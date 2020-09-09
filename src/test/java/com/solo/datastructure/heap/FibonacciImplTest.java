package com.solo.datastructure.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FibonacciImplTest {

  FibonacciImpl<Integer> fibonacci;


  @BeforeEach
  void setUp() {
    fibonacci = new FibonacciImpl<>();
  }

  @Test
  void insertToHead() {
    fibonacci.insertion(4);
    Assertions.assertNotNull(fibonacci.getMin());
    int result = fibonacci.getMin();
    Assertions.assertEquals(4, result);
  }

  @Test
  void linkedToClearlyTest() {
    fibonacci.insertion(4);
    fibonacci.insertion(6);
    Assertions.assertNotNull(fibonacci.getMin());
    int result = fibonacci.getMin();
    Assertions.assertEquals(4, result);
    int result1 = fibonacci.getMinNode().next.value;
    Assertions.assertEquals(6, result1);
  }

  @Test
  void minValueChangestest() {
    fibonacci.insertion(4);
    fibonacci.insertion(2);
    Assertions.assertNotNull(fibonacci.getMin());
    int result = fibonacci.getMin();
    Assertions.assertEquals(2, result);
  }


  @Test
  void nullExceptionTest() {
    Assertions.assertThrows(NullPointerException.class, () -> {
      fibonacci.insertion(null);
    });
  }
}