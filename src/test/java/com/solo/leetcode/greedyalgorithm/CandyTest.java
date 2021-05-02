package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CandyTest {

    Candy candy;

    @BeforeEach
    void setUp() {
        candy = new Candy();
    }

    @Test
    void test1() {
        var input = new int[]{1, 0, 2};
        assertEquals(5, candy.candyDistribution(input));
    }

    @Test
    void test2() {
        var input = new int[]{1, 2, 2};
        assertEquals(4, candy.candyDistribution(input));
    }
}