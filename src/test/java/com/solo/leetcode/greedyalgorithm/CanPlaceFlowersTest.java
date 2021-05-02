package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CanPlaceFlowersTest {
    CanPlaceFlowers canPlaceFlowers;

    @BeforeEach
    void setUp() {
        canPlaceFlowers = new CanPlaceFlowers();
    }

    @Test
    void name() {
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{1,}, 1));
    }
}