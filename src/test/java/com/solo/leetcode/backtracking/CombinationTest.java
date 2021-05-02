package com.solo.leetcode.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CombinationTest {

    private Combination combination;


    @BeforeEach
    void setUp() {
        combination = new Combination();
    }

    @Test
    void test1() {
        var sol = List.of(List.of(1, 2), List.of(1, 3), List.of(1, 4), List.of(2, 3), List.of(2, 4), List.of(3, 4));

        assertEquals(sol, combination.combination(4, 2));
    }
}