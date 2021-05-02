package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IsSubsequenceTest {
    private IsSubsequence isSubsequence;

    @BeforeEach
    void setUp() {
        isSubsequence = new IsSubsequence();
    }

    @Test
    void test1() {
        assertTrue(isSubsequence.isSubsequence("abc", "ahbgdc"));
    }
}