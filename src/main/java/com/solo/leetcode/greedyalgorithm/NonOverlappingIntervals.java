package com.solo.leetcode.greedyalgorithm;

import java.util.PriorityQueue;

/**
 * Given a collection of intervals, find the minimum number of intervals you need to remove to make
 * the rest of the intervals non-overlapping.
 */
public class NonOverlappingIntervals {

  public int eraseOverlappingIntervals(int[][] input) {

    PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]);
    for (int[] inp : input) {
      priorityQueue.add(inp);
    }
    int previous = priorityQueue.poll()[1];
    int count = 0;
    while (!priorityQueue.isEmpty()) {
      if (priorityQueue.peek()[0] < previous) {
        count++;
        priorityQueue.poll();
      } else {
        previous = priorityQueue.poll()[1];
      }
    }
    return count;
  }
}
