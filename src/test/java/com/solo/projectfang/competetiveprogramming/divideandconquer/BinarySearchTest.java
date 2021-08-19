package com.solo.projectfang.competetiveprogramming.divideandconquer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private BinarySearch binarySearch;


    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    void test1() {
        assertEquals(23, binarySearch.binarysearch(new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91},23 ,0, 9));
    }

    @Test
    void negativeTest() {
        assertEquals(-1, binarySearch.binarysearch(new int[]{-1,0,3,5,9,12},2 ,0, 9));

    }
}