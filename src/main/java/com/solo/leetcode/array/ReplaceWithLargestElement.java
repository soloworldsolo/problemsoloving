package com.solo.leetcode.array;

/**
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
 * <p>
 * After doing so, return the array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: arr = [400]
 * Output: [-1]
 * Explanation: There are no elements to the right of index 0.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 104
 * 1 <= arr[i] <= 105
 */
public class ReplaceWithLargestElement {
    public int[] replaceElements(int[] arr) {
        int maxElement = arr[arr.length - 1];
        int[] res = new int[arr.length - 1];

        int index = res.length -2;
        while (index >=0) {
            res[index] = maxElement;
            maxElement = Math.max(maxElement,arr[index--] );
        }

        return res;
    }
}

