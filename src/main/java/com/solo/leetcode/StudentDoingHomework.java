package com.solo.leetcode;

public class StudentDoingHomework {

  public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
    int total = 0;
    for (int i = 0; i < startTime.length; i++) {
      if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
        total++;
      }
    }
    return total;
  }
}


