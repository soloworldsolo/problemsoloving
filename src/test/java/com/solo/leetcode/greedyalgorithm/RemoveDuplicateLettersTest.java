package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveDuplicateLettersTest {

    RemoveDuplicateLetters removeDuplicateLetters;

    @BeforeEach
    void setUp() {
        removeDuplicateLetters = new RemoveDuplicateLetters();
    }

    @Test
    void test1() {
        Assertions.assertEquals("abc", removeDuplicateLetters.removeDuplicateLetters("bcabc"));
    }
}