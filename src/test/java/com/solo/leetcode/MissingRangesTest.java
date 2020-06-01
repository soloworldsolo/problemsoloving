package com.solo.leetcode;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MissingRangesTest {

  MissingRanges missingRanges;

  @BeforeEach
  void setUp() {
    missingRanges = new MissingRanges();
  }

  @Test
  void testCase1() {
    Assertions
        .assertEquals(List.of("2", "4->49", "51->74", "76->99"),
            missingRanges.findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99));
  }

  @Test
  void testCase2() {
    Assertions
        .assertEquals(List.of("1"),
            missingRanges.findMissingRanges(new int[]{}, 1, 1));
  }

  @Test
  void testCase3() {
    Assertions
        .assertEquals(List.of("-3->-1"),
            missingRanges.findMissingRanges(new int[]{}, -3, -1));
  }

  @Test
  void testCase4() {
    Assertions
        .assertEquals(Collections.EMPTY_LIST,
            missingRanges.findMissingRanges(new int[]{-1}, -1, -1));
  }

  @Test
  void testCase5() {
    Assertions
        .assertEquals(List.of("-2"),
            missingRanges.findMissingRanges(new int[]{-1}, -2, -1));
  }

  @Test
  void testCase6() {
    Assertions
        .assertEquals(List.of("-2147483647->-1", "1->2147483646"),
            missingRanges
                .findMissingRanges(new int[]{-2147483648, -2147483648, 0, 2147483647, 2147483647},
                    -2147483648, 2147483647));
  }

  @Test
  void testCase7() {
    Assertions
        .assertEquals(List.of("-2147483647->2147483647"),
            missingRanges
                .findMissingRanges(new int[]{-2147483648},
                    -2147483648, 2147483647));
  }
}