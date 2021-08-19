package com.solo.projectfang.competetiveprogramming.divideandconquer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLastArrayTest {

    private FirstLastArray firstLastArray;

    @BeforeEach
    void setUp() {
        firstLastArray = new FirstLastArray();
    }

    @Test
    void test1() {
        int[] input = new int[]{5, 7, 7, 8, 8, 10};
        int[] output = new int[]{3, 4};
        assertArrayEquals(output, firstLastArray.findRange(input, 8));
    }
    @Test
    void failedCase1() {
        int[] input = new int[]{1};
        int[] output = new int[]{0, 0};
        assertArrayEquals(output, firstLastArray.findRange(input, 1));
    }

    @Test
    void failedCase2() {
        int[] input = new int[]{2,2};
        int[] output = new int[]{0, 1};
        assertArrayEquals(output, firstLastArray.findRange(input, 2));
    }
    @Test
    void failedCase3() {
        int[] input = new int[]{1,2,3};
        int[] output = new int[]{2, 2};
        assertArrayEquals(output, firstLastArray.findRange(input, 3));
    }
}