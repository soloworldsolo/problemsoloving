package com.solo.projectfang.competetiveprogramming.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnapsackProblemTest {

    private KnapsackProblem knapsackProblem;

    @BeforeEach
    void setUp() {
        knapsackProblem = new KnapsackProblem();
    }

    @Test
    void test1() {
        var input =new int[][] {{60,10},{100,20},{120,30}};
        assertEquals(240,knapsackProblem.maxProfit(input,50));
    }
}