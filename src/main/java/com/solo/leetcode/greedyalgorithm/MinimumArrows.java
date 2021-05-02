package com.solo.leetcode.greedyalgorithm;

import java.util.Arrays;

/**
 * There are some spherical balloons spread in two-dimensional space. For each balloon, provided
 * input is the start and end coordinates of the horizontal diameter. Since it's horizontal,
 * y-coordinates don't matter, and hence the x-coordinates of start and end of the diameter suffice.
 * The start is always smaller than the end.
 * <p>
 * An arrow can be shot up exactly vertically from different points along the x-axis. A balloon with
 * xstart and xend bursts by an arrow shot at x if xstart ≤ x ≤ xend. There is no limit to the
 * number of arrows that can be shot. An arrow once shot keeps traveling up infinitely.
 * <p>
 * Given an array points where points[i] = [xstart, xend], return the minimum number of arrows that
 * must be shot to burst all balloons.
 */
public class MinimumArrows {

    public int noOfArrows(int[][] input) {
        if (input.length == 0) {
            return 0;
        }
        Arrays.sort(input, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return 0;
            }
            if (o1[1] < o2[1]) {
                return -1;
            }
            return 1;
        });
        int arrows = 1;
        int[] previous = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i][0] > previous[1]) {
                previous = input[i];
                arrows++;
            }
        }
        return arrows;
    }
}
