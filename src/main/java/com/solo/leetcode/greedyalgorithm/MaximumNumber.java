package com.solo.leetcode.greedyalgorithm;

import java.util.Arrays;
import java.util.Collections;

/**
 * You are given two integer arrays nums1 and nums2 of lengths m and n respectively. nums1 and nums2
 * represent the digits of two numbers. You are also given an integer k.
 * <p>
 * Create the maximum number of length k <= m + n from digits of the two numbers. The relative order
 * of the digits from the same array must be preserved.
 * <p>
 * Return an array of the k digits representing the answer.
 */
public class MaximumNumber {

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int result[] = new int[k];
        int firstIndex = 0;
        int secondIndex = 0;
        nums1 = Arrays.stream(nums1).boxed().sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
        nums2 = Arrays.stream(nums2).boxed().sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
        int index = 0;
        while ((firstIndex < nums1.length || secondIndex < nums2.length) && index < k) {
            if (firstIndex < nums1.length && nums1[firstIndex] >= nums2[secondIndex]) {
                result[index++] = (nums1[firstIndex++]);

            } else if (secondIndex < nums2.length && nums1[firstIndex] < nums2[secondIndex]) {
                result[index++] = (nums2[secondIndex++]);


            } else if ((firstIndex >= nums1.length && secondIndex < nums2.length) || (
                    secondIndex >= nums2.length
                            && firstIndex < nums1.length)) {
                if (firstIndex >= nums1.length) {
                    result[index++] = (nums2[secondIndex++]);
                } else {
                    result[index++] = (nums1[firstIndex++]);
                }


            }
        }

        return result;
    }
}


