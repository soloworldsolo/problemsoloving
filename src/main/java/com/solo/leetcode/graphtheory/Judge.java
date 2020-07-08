package com.solo.leetcode.graphtheory;


public class Judge {

  public int findJudge(int N, int[][] trust) {
    int[] trusting = new int[N + 1];
    int[] truestedby = new int[N + 1];
    for (int[] trus : trust) {
      truestedby[trus[0]] += 1;
      trusting[trus[1]] += 1;
    }
    for (int i = 1; i <= N; i++) {
      if ((trusting[i] == N - 1) && (truestedby[i] == 0)) {
        return i;
      }
    }
    return -1;
  }


}
