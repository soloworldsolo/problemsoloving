package com.solo.leetcode.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PermutationTest {

    private Permutation permutation;

    @Test
    void test1() {
        permutation = new Permutation();
        List<List<Integer>> result = List.of(List.of(1, 2, 3), List.of(1, 3, 2),
                List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1));
        Assertions.assertEquals(result, permutation.permute(new int[]{1, 2, 3}));
    }

}