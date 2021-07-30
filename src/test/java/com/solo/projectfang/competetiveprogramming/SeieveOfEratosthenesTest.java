package com.solo.projectfang.competetiveprogramming;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SeieveOfEratosthenesTest {

  private SeieveOfEratosthenes seieveOfEratosthenes;

  @BeforeEach
  void setUp() {
    seieveOfEratosthenes = new SeieveOfEratosthenes();
  }

  @Test
  void test1() {
    assertTrue(seieveOfEratosthenes.isPrime(13));
    assertFalse(seieveOfEratosthenes.isPrime(14));
    assertFalse(seieveOfEratosthenes.isPrime(15));
  }
}