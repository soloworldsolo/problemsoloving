package com.solo.leetcode.divideandconquer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianSortedArraysTest {
    MedianSortedArrays medianSortedArrays;

    @BeforeEach
    void setUp() {
        medianSortedArrays = new MedianSortedArrays();
    }

    @Test
    void test1() {
        var input = new int[]{1, 3};
        var input2 = new int[]{2};
        assertEquals(2.0000, medianSortedArrays.findMedianBinarySearch(input, input2));

    }

    @Test
    void test2() {
        var input = new int[]{1, 2};
        var input2 = new int[]{3, 4};
        assertEquals(2.5000, medianSortedArrays.findMedianBinarySearch(input, input2));

    }

    @Test
    void test3() {
        var input = new int[]{0, 0};
        var input2 = new int[]{0, 0};
        assertEquals(0.0000, medianSortedArrays.findMedian(input, input2));
        assertEquals(0.0000, medianSortedArrays.findMedianBinarySearch(input, input2));

    }
}