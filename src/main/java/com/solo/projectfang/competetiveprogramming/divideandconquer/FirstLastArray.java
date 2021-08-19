package com.solo.projectfang.competetiveprogramming.divideandconquer;

/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * <p>
 * If target is not found in the array, return [-1, -1].
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class FirstLastArray {

    public int[] findRange(int[] nums, int target) {
        int startIndex = BST(nums, target, 0, nums.length, true);
        int endIndex = BST(nums, target, 0, nums.length, false);
        return new int[]{startIndex, endIndex};
    }

    private int BST(int[] input, int num, int start, int end, boolean isFirst) {
        while (start < end) {
            int mid = start + ((end - start) / 2);

            if (input[mid] == num) {
                if (isFirst) {
                    while (mid >= 0 && input[mid] == num) {
                        mid--;
                    }
                    return ++mid;
                } else {
                    while (mid < input.length && input[mid] == num) {
                        mid++;
                    }
                    if (mid > 0) {
                        mid--;
                    }
                    return mid;
                }
            }
            if (input[mid] < num) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return -1;
    }
}
