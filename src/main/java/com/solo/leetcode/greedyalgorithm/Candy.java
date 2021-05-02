package com.solo.leetcode.greedyalgorithm;

import java.util.Arrays;

/**
 * There are n children standing in a line. Each child is assigned a rating value given in the
 * integer array ratings.
 * <p>
 * You are giving candies to these children subjected to the following requirements:
 * <p>
 * Each child must have at least one candy. Children with a higher rating get more candies than
 * their neighbors. Return the minimum number of candies you need to have to distribute the candies
 * to the children.
 */
public class Candy {

    public int candyDistribution(int[] input) {
        if (input.length == 0) {
            return 0;
        }

        int[] candies = new int[input.length];

        Arrays.fill(candies, 1);
        for (int i = 1; i < input.length; i++) {
            if (input[i] > input[i - 1]) {
                candies[i] = candies[1] + 1;
            }
        }
        for (int i = input.length - 2; i > 0; i--) {
            if (input[i] > input[i - 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        int count = 0;

        for (int candy : candies) {
            count += candy;
        }

        return count;
    }
}
