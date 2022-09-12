package com.solo.leetcode.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKclosest {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        Arrays.sort(arr);

        return findClosestRange(arr, k, x);

    }


    private List<Integer> findClosestRange(int[] newarr, int number, int noOfElem) {
        List<Integer> result = new ArrayList<>();

        return result;
    }
}
