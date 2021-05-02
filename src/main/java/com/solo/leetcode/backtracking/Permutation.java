package com.solo.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums of distinct integers, return all the possible permutations. You can return
 * the answer in any order.
 */
public class Permutation {

    public List<List<Integer>> permute(int[] ints) {
        if (ints.length == 1) {
            return List.of(List.of(ints[0]));
        }
        List<List<Integer>> result = new ArrayList<>();
        compute(new ArrayList<>(), new boolean[ints.length], result, ints);
        return result;
    }

    private void compute(List<Integer> currentList, boolean[] visited,
                         List<List<Integer>> result, final int[] input) {

        if (currentList.size() == input.length) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = 0; i < input.length; i++) {
            if (!visited[i] == true) {
                currentList.add(input[i]);
                visited[i] = true;
                compute(currentList, visited, result, input);
                currentList.remove(currentList.size() - 1);
                visited[i] = false;
            }
        }

    }


}
