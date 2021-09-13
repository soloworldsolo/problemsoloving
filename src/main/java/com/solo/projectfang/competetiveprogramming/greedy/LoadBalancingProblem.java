package com.solo.projectfang.competetiveprogramming.greedy;

import java.util.Arrays;

public class LoadBalancingProblem {

    public int balanceLoad(int[] ints) {
        int load = 0;
        int maxLoad = 0;
        int sum = Arrays.stream(ints).sum();
        load = sum / ints.length;
        int diff =0;

        for (int i = 0; i < ints.length; i++) {
            diff += ints[i] - load;
            maxLoad = Math.max(maxLoad, Math.abs(diff));
        }

        return maxLoad;
    }
}
