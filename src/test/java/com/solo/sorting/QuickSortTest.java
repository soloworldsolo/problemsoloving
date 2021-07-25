package com.solo.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuickSortTest {

    QuickSort quickSort;


    @BeforeEach
    void setUp() {
        quickSort = new QuickSort();
    }


    @Test
    void test1() {
        int[] inputarray = {14, 33, 27, 10, 35, 19, 42, 44};
        quickSort.sort(inputarray);
        assertArrayEquals(inputarray, new int[]{10, 14, 19, 27, 33, 35, 42, 44});


    }

    @Test
    void test2() {
        int[] inputarray = {10, 80, 30, 90, 40, 50, 70};
        quickSort.sort(inputarray);
        assertArrayEquals(inputarray, new int[]{10, 30, 40, 50, 70, 80, 90});


    }
}