package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumArrowsTest {

    MinimumArrows minimumArrows;

    @BeforeEach
    void setUp() {
        minimumArrows = new MinimumArrows();
    }

    @Test
    void test1TwoArrows() {
        var input = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        assertEquals(2, minimumArrows.noOfArrows(input));
    }

    @Test
    void test1TwoArrows2() {
        var input = new int[][]{{-2147483646, -2147483645}, {2147483646, 2147483647}};
        assertEquals(2, minimumArrows.noOfArrows(input));
    }
}