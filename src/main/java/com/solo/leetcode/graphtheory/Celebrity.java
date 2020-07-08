package com.solo.leetcode.graphtheory;

public class Celebrity {

  public int findCelebrity(int n) {
    int celebrity = 0;
    for (int i = 0; i < n; i++) {
      if (knows(celebrity, i)) {
        celebrity = i;
      }

    }

    for (int j = 0; j < n; j++) {
      if (celebrity != j) {
        if (!knows(j, celebrity) || knows(celebrity, j)) {
          return -1;
        }
      }
    }

    return celebrity;
  }
}
