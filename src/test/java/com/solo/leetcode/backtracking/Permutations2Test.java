package com.solo.leetcode.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Permutations2Test {

    private Permutations2 permutations2;

    @BeforeEach
    void setUp() {
        permutations2 = new Permutations2();
    }

    @Test
    void test1() {
        var sol = List.of(List.of(1, 1, 2), List.of(1, 2, 1), List.of(2, 1, 1));
        assertEquals(sol, permutations2.permuteUnique(new int[]{1, 1, 2}));
    }
}