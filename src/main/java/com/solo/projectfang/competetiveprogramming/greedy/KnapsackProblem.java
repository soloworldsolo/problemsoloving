package com.solo.projectfang.competetiveprogramming.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Given weights and values of n items, we need to put these items in a
 * knapsack of capacity W to get the maximum total value in the knapsack.
 * <p>
 * In the 0-1 Knapsack problem, we are not allowed to break items.
 * We either take the whole item or don’t take it.
 */
public class KnapsackProblem {
    public double maxProfit(int[][] input, int maxCapacity) {
        List<Bucket> bucketList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            int value = input[i][0] / input[i][1];
            bucketList.add(new Bucket(value, input[i][0], input[i][1]));
        }
        bucketList.sort(Comparator.comparingInt(Bucket::getValue).reversed());
        int availableCapacity = maxCapacity;
        double result = 0;
        int i = 0;
        Bucket current = null;
        while (availableCapacity > 0 && i < bucketList.size()) {
            current = bucketList.get(i++);
            int currentCapacity = current.capacity;
            if (currentCapacity <= availableCapacity) {
                result += current.input;
                availableCapacity -= current.capacity;
            } else {
                int val = availableCapacity * current.value;
                availableCapacity = 0;
                result += val;
            }
        }
        return result;
    }

    private static class Bucket {
        private int value;
        private int input;
        private int capacity;

        public int getValue() {
            return value;
        }

        public int getInput() {
            return input;
        }

        public int getCapacity() {
            return capacity;
        }

        public Bucket(int index, int input, int capacity) {
            this.value = index;
            this.input = input;
            this.capacity = capacity;
        }

        public Bucket() {
        }
    }
}
