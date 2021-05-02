package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveKDigitsTest {

    RemoveKDigits removeKDigits;

    @BeforeEach
    void setUp() {
        removeKDigits = new RemoveKDigits();
    }

    @Test
    void test1RemoveThreeCharacters() {
        assertEquals("1219", removeKDigits.removeDigits("1432219", 3));
    }
}