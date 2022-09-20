package com.solo.leetcode.array.prefixsum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSubArrayTest {

    private  MinimumSubArray minimumSubArray;

    @BeforeEach
    void setUp() {
        minimumSubArray = new MinimumSubArray();
    }

    @Test
    void test1() {

        var inp = new int[] {2,3,1,2,4,3};

        int res = minimumSubArray.minSubArrayLen(7, inp);
        assertEquals(2,res);

    }
    @Test
    void test2() {

        var inp = new int[] {1,4,4};

        int res = minimumSubArray.minSubArrayLen(4, inp);
        assertEquals(1,res);

    }

    @Test
    void test3() {

        var inp = new int[] {1,1,1,1,1,1,1,1};

        int res = minimumSubArray.minSubArrayLen(11, inp);
        assertEquals(0,res);

    }
}