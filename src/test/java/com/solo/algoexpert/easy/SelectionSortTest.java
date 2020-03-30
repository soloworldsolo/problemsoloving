package com.solo.algoexpert.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

  SelectionSort selectionSort = null;

  @BeforeEach
  void setUp() {
    selectionSort = new SelectionSort();
  }

  @Test
  void sanityTest() {
    int[] input = {4, 3, 2, 10, 12, 1, 5, 6};
    int[] expected = {1, 2, 3, 4, 5, 6, 10, 12};
    Assertions.assertArrayEquals(selectionSort.selectionSort(input), expected);
  }

  @Test
  void TestCase1() {
    int[] expected = {
        -998, -882, -827, -817, -796, -731, -681, -657, -581, -523, -435, -387, -382, -331, -269,
        -255, -220, -216, -169, -163, -75, -43, -6, 80, 100, 180, 228, 280, 354, 366, 372, 382, 382,
        432, 471, 519, 652, 680, 747, 749, 753, 769, 771, 805, 847, 906, 913, 956, 972, 980, 991
    };

    int[] input = {
        991, -731, -882, 100, 280, -43, 432, 771, -581, 180, -382, -998, 847, 80, -220, 680, 769,
        -75,
        -817, 366, 956, 749, 471, 228, -435, -269, 652, -331, -387, -657, -255, 382, -216, -6, -163,
        -681, 980, 913, -169, 972, -523, 354, 747, 805, 382, -827, -796, 372, 753, 519, 906
    };
    Assertions.assertArrayEquals(selectionSort.selectionSort(input),expected);
  }
}