package com.solo.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Given two integer arrays nums1 and nums2,
 * return an array of their intersection.
 * Each element in the result must appear as many times as it shows
 * in both arrays and you may return the result in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 */
public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        var firstMap = getCollect(nums1.length > nums2.length ? nums2:nums1);
        List<Integer> result = new ArrayList<>();
        int[] process = nums1.length > nums2.length ? nums1 : nums2;
        for(int num:process) {
            long count = firstMap.getOrDefault(num,0L);
            if(count >0) {
                result.add(num);
                firstMap.computeIfPresent(num ,(key,val) -> --val);
            }
        }
        return result.stream().mapToInt(in ->in).toArray();
    }

    private Map<Integer, Long> getCollect(int[] nums1) {
        return Arrays.stream(nums1)
                .boxed()
                .collect(groupingBy(s -> s, counting()));
    }
}
