package com.solo.leetcode.divideandconquer;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the
 * two sorted arrays.
 */
public class MedianSortedArrays {

    public double findMedian(int[] input, int[] input2) {
        int firstIndex = 0;
        int secondIndex = 0;
        int currentIndex = 0;
        int[] result = new int[input.length + input2.length];
        while (firstIndex < input.length || secondIndex < input2.length) {
            if (firstIndex < input.length && secondIndex < input2.length) {
                if (input[firstIndex] < input2[secondIndex]) {
                    result[currentIndex++] = input[firstIndex++];
                } else {
                    result[currentIndex++] = input2[secondIndex++];
                }
            } else {
                if (firstIndex >= input.length) {
                    while (secondIndex < input2.length) {
                        result[currentIndex++] = input2[secondIndex++];
                    }
                } else if (secondIndex >= input2.length) {
                    while (firstIndex < input.length) {
                        result[currentIndex++] = input[firstIndex++];
                    }
                }

            }
        }
        if ((result.length & 1) == 0) {
            int index = (result.length - 1) / 2;
            int index2 = index + 1 < result.length ? result[index + 1] : 0;
            double val = ((result[index]) + index2);
            return val / 2;
        }
        return result[result.length / 2];
    }

    public double findMedianBinarySearch(int[] input1, int[] input2) {

        if (input1.length > input2.length) { // to ensure m<=n
            int[] temp = input1;
            input1 = input2;
            input2 = temp;
        }
        int start = 0;
        int end = input1.length;
        int middle = (input1.length + input2.length + 1) / 2;

        while (start <= end) {
            int partx = (start + end) / 2;
            int party = middle - partx;

            int maxleftx = (partx == 0) ? Integer.MIN_VALUE : input1[partx - 1];
            int minrightx = (partx == input1.length) ? Integer.MAX_VALUE : input1[partx];

            int maxlefty = (party == 0) ? Integer.MIN_VALUE : input2[party - 1];
            int minrighty = (party == input2.length) ? Integer.MAX_VALUE : input2[party];

            if (maxleftx <= minrighty && maxlefty <= minrightx) {
                if (((input1.length + input2.length) & 1) == 0) {
                    return (Math.max(maxleftx, maxlefty) + Math.min(minrightx, minrighty)) / 2.0;
                }
                return (double) Math.max(maxleftx, maxlefty);
            } else if (maxleftx > minrighty) {
                end = partx - 1;
            } else {
                start = partx + 1;
            }
        }
        return 0;
    }

}
