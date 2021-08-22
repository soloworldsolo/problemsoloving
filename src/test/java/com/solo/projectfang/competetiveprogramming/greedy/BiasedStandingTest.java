package com.solo.projectfang.competetiveprogramming.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiasedStandingTest {
   private BiasedStanding biasedStanding;

    @BeforeEach
    void setUp() {
        biasedStanding = new BiasedStanding();
    }

    @Test
    void test1() {
        assertEquals(5,biasedStanding.biasedStanding(new int[]{1,2,2,1,5,7,7}));
    }
}