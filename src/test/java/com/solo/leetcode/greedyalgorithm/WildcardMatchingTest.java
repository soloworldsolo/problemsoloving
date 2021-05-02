package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class WildcardMatchingTest {
    WildcardMatching wildcardMatching;

    @BeforeEach
    void setUp() {
        wildcardMatching = new WildcardMatching();
    }

    @Test
    void test1() {
        assertFalse(wildcardMatching.ismatch("aa", "a"));
    }
}