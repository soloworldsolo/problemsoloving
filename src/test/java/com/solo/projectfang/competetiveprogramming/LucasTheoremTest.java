package com.solo.projectfang.competetiveprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LucasTheoremTest {
  LucasTheorem lucasTheorem;

    @BeforeEach
    void setUp() {
        lucasTheorem = new LucasTheorem();
    }

    @Test
    void testq() {
      // assertEquals( 8,lucasTheorem.nCrModulus(1000,900,13));
       assertEquals( 7,lucasTheorem.nCrModulus(100,30,13));

    }
}