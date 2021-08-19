package com.solo.projectfang.competetiveprogramming.divideandconquer;

/**
 * program to find the binary search
 */
public class BinarySearch {
    public int binarysearch(int[] input, int number, int start, int end) {
        while (start < end) {
            int mid =start + (end - start) / 2;
            if (input[mid] == number) {
                return number;
            }

            if (input[mid] < number) {
                start = mid+1;
            } else {
                end = mid;
            }

        }
        return -1;
    }
}
