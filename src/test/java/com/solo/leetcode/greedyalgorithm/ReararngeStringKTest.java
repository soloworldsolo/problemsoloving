package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReararngeStringKTest {

    ReararngeStringK reararngeStringK;

    @BeforeEach
    void setUp() {
        reararngeStringK = new ReararngeStringK();
    }

    @Test
    void test1() {
        var input = "aabbcc";
        assertEquals("abcabc", reararngeStringK.rearrange(input, 3));
    }
}