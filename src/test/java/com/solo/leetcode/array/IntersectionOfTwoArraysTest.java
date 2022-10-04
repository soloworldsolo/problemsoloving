package com.solo.leetcode.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysTest {

    private IntersectionOfTwoArrays intersectionOfTwoArrays;


    @BeforeEach
    void setUp() {
        intersectionOfTwoArrays = new IntersectionOfTwoArrays();
    }


    @Test
    void test1() {
        var input = new int[] {1,2,2,1};
        var input2 = new int[] {2,2};

        int[] result = intersectionOfTwoArrays.intersect(input, input2);

        assertArrayEquals(result , new int[]{2,2});
    }
}