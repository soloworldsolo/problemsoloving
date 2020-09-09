package com.solo.leetcode.graphtheory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CourseSchedule2Test {

  CourseSchedule2 courseSchedule2;

  @BeforeEach
  void setUp() {
    courseSchedule2 = new CourseSchedule2();
  }

  @Test
  void courseScheduleFourCoursesTest() {
    int[][] input = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
    int[] result = {0, 1, 2, 3};
    Assertions.assertArrayEquals(result, courseSchedule2.findOrder(4, input));
  }

  @Test
  void courseScheduleFourCycleTest() {
    int[][] input = {{1, 0}, {0, 1}};
    int[] result = {};
    Assertions.assertArrayEquals(result, courseSchedule2.findOrder(2, input));
  }
}