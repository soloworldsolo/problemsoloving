package com.solo.leetcode.greedyalgorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Given an array of meeting time intervals intervals where intervals[i] = [starti, endi], return
 * the minimum number of conference rooms required.
 */
public class MeetingRooms {

    public int noOfRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]
        );
        PriorityQueue<Integer> meetings = new PriorityQueue<>((a, b) -> a - b);
        meetings.add(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= meetings.peek()) {
                meetings.poll();
            }
            meetings.add(intervals[i][1]);
        }
        return meetings.size();
    }
}
