package com.solo.leetcode.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class CombinationalSum2Test {

    CombinationalSum2 combinationalSum2;

    @BeforeEach
    void setUp() {
        combinationalSum2 = new CombinationalSum2();
    }

    @Test
    void test1() {
        var result = List.of(List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6));
        Assertions.assertEquals(result, combinationalSum2.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }
}