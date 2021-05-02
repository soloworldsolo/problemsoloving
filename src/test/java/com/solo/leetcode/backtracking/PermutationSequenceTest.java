package com.solo.leetcode.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermutationSequenceTest {

    private PermutationSequence permutationSequence;

    @BeforeEach
    void setUp() {
        permutationSequence = new PermutationSequence();
    }

    @Test
    void test1() {
        var sol = "213";
        assertEquals(sol, permutationSequence.getPermuation(3, 3));
    }
}