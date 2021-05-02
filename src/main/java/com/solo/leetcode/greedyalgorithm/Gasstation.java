package com.solo.leetcode.greedyalgorithm;

/**
 * There are n gas stations along a circular route, where the amount of gas at the ith station is
 * gas[i].
 * <p>
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith
 * station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas
 * stations.
 * <p>
 * Given two integer arrays gas and cost, return the starting gas station's index if you can travel
 * around the circuit once in the clockwise direction, otherwise return -1. If there exists a
 * solution, it is guaranteed to be unique
 */
public class Gasstation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0;
        int result = 0;
        int current = 0;

        for (int i = 0; i < gas.length; i++) {

            current += gas[i] - cost[i];
            result += gas[i] - cost[i];

            if (current < 0) {
                current = 0;
                index = i + 1;
            }

        }

        return result >= 0 ? index : -1;

    }


    private int getIndex(int index, int maxIndex) {
        if (index < 0) {
            return maxIndex;
        }

        if (index > maxIndex) {
            return 0;
        }

        return index;
    }

}
