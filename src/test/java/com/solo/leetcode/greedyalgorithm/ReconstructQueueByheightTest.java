package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReconstructQueueByheightTest {

    ReconstructQueueByheight reconstructQueueByheight;

    @BeforeEach
    void setUp() {
        reconstructQueueByheight = new ReconstructQueueByheight();
    }

    @Test
    void test1() {
        assertArrayEquals(new int[][]{{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}},
                reconstructQueueByheight
                        .reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}}));
    }
}