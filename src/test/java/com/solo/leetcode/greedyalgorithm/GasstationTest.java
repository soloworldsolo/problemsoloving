package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GasstationTest {

    private Gasstation gasstation;


    @BeforeEach
    void setUp() {
        gasstation = new Gasstation();
    }

    @Test
    void test1() {
        assertEquals(3,
                gasstation.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    void testnopath() {
        assertEquals(-1,
                gasstation.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }

    @Test
    void testnopath1() {
        assertEquals(-1,
                gasstation.canCompleteCircuit(new int[]{3, 3, 4}, new int[]{3, 4, 4}));
    }

    @Test
    void testnopath2() {
        assertEquals(4,
                gasstation.canCompleteCircuit(new int[]{5, 1, 2, 3, 4}, new int[]{4, 4, 1, 5, 1}));
    }
}