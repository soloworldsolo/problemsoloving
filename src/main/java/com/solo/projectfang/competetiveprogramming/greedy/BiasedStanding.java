package com.solo.projectfang.competetiveprogramming.greedy;

import java.util.Arrays;

/**
 * In a competition, each team is able to enter its preferred place in the rank list.
 * Suppose that we already have a rank list. For each team, compute the distance between its
 * preferred place and its actual place in the rank-list. The sum of these distances will be called the badness
 * of this rank list. Given team names and their preferred placements in the rank list,
 * find one rank list with minimal possible badness and p
 */
public class BiasedStanding {
    public int biasedStanding(int[] input) {
        Arrays.sort(input);
        int sum =0;
        for( int i=1;i<input.length;i++) {
            sum += Math.abs(i -input[i-1]);
        }
        return sum;
    }
}
