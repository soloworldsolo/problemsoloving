package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AssignCookiesTest {
    AssignCookies assignCookies;

    @BeforeEach
    void setUp() {
        assignCookies = new AssignCookies();
    }

    @Test
    void test1OnlyOnesatisfied() {
        assertEquals(1, assignCookies.findContentWithChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
    }

    @Test
    void test1OnlyTwosatisfied() {
        assertEquals(2, assignCookies.findContentWithChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }

    @Test
    void test1OnlyTwosatisfied1() {
        assertEquals(2, assignCookies.findContentWithChildren(new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8}));
    }
}