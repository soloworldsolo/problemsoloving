package com.solo.projectfang.competetiveprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExtendedEcludeinTest {

  private ExtendedEcludein extendedEcludein;

  @BeforeEach
  void setUp() {
    extendedEcludein = new ExtendedEcludein();
  }

  @Test
  void test1() {
    assertEquals(5, extendedEcludein.gcd(35, 15, new AtomicInteger(1), new AtomicInteger(1)));
    assertEquals(3, extendedEcludein.gcd(81, 57, new AtomicInteger(1), new AtomicInteger(1)));
  }

  @Test
  void test11() {
    assertEquals(3, extendedEcludein.gcd(123, 45, new AtomicInteger(1), new AtomicInteger(1)));
  }
}