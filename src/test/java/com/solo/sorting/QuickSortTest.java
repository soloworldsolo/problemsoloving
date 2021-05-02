package com.solo.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
}