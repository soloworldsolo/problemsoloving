package com.solo.leetcode.greedyalgorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * You are given an array of people, people, which are the attributes of some people in a queue (not
 * necessarily in order). Each people[i] = [hi, ki] represents the ith person of height hi with
 * exactly ki other people in front who have a height greater than or equal to hi.
 * <p>
 * Reconstruct and return the queue that is represented by the input array people. The returned
 * queue should be formatted as an array queue, where queue[j] = [hj, kj] is the attribut
 */
public class ReconstructQueueByheight {


    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,
                (int[] o1, int[] o2) -> {
                    return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
                }
        );

        List<int[]> output = new LinkedList<>();
        for (int[] p : people) {
            output.add(p[1], p);
        }

        int n = people.length;
        return output.toArray(new int[n][2]);
    }
}
