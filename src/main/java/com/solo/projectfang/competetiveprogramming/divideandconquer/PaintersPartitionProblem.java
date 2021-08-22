package com.solo.projectfang.competetiveprogramming.divideandconquer;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class PaintersPartitionProblem {
    public int partition(int[] input, int length, int numOfPainters) {
        IntSummaryStatistics intSummaryStatistics = Arrays.stream(input).boxed().mapToInt(i -> i).summaryStatistics();
        int low = intSummaryStatistics.getMax();
        int high = (int) intSummaryStatistics.getSum();
        while (low < high) {
            int mid = low + (high - low) / 2;
            int requiredPainters = numberOfPainters(input, length, mid);


            if (requiredPainters <= numOfPainters)
                high = mid;

            else
                low = mid + 1;
        }

        return low;
    }

    private int numberOfPainters(int[] input, int length, int mid) {
        int total = 0;
        int numPainters = 1;

        for (int i = 0; i < length; i++) {
            total += input[i];

            if (total > mid) {
                total = input[i];
                numPainters++;
            }
        }

        return numPainters;
    }


}

