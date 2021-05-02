package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NonOverlappingIntervalsTest {
    NonOverlappingIntervals nonOverlappingIntervals;

    @BeforeEach
    void setUp() {
        nonOverlappingIntervals = new NonOverlappingIntervals();
    }

    @Test
    void test1() {
        var input = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        assertEquals(1, nonOverlappingIntervals.eraseOverlappingIntervals(input));
    }

    @Test
    void test2() {
        var input = new int[][]{{1, 2}, {1, 2}, {1, 2}};
        assertEquals(2, nonOverlappingIntervals.eraseOverlappingIntervals(input));
    }
}