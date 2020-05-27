package com.solo.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentDoingHomeworkTest {

  StudentDoingHomework studentDoingHomework;

  @BeforeEach
  void setUp() {
    studentDoingHomework = new StudentDoingHomework();
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(1,
        studentDoingHomework.busyStudent(new int[]{1, 2, 3}, new int[]{3, 2, 7}, 4));
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(1, studentDoingHomework.busyStudent(new int[]{4}, new int[]{4}, 4));
  }

  @Test
  void testCase3() {
    Assertions.assertEquals(0, studentDoingHomework.busyStudent(new int[]{4}, new int[]{4}, 5));
  }

  @Test
  void testCase4() {
    Assertions.assertEquals(0,
        studentDoingHomework.busyStudent(new int[]{1, 1, 1, 1}, new int[]{1, 3, 2, 4}, 7));
  }


  @Test
  void testCase5() {
    Assertions.assertEquals(5, studentDoingHomework
        .busyStudent(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1},
            new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10}, 5));
  }
}