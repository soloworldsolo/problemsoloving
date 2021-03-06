package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PatchingArrayTest {

    PatchingArray patchingArray;

    @BeforeEach
    void setUp() {
        patchingArray = new PatchingArray();
    }

    @Test
    void test1() {
        assertEquals(1, patchingArray.patch(new int[]{1, 3}, 6));
    }

    @Test
    void test2() {
        assertEquals(2, patchingArray.patch(new int[]{1, 2, 4, 13, 43}, 100));
    }
}