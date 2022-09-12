package com.solo.projectfang.competetiveprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimeFactorsTest {

  private PrimeFactors primeFactors;

  @BeforeEach
  void setUp() {
    primeFactors = new PrimeFactors();
  }

  @Test
  void test1() {
    assertEquals(List.of(2, 3), primeFactors.findFactors(12));
  }

  @Test
  void test2() {
    assertEquals(List.of(2, 3), primeFactors.findFactors(6));
    assertEquals(List.of( 3,5), primeFactors.findFactors(15));
  }
}