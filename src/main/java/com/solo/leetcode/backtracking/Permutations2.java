package com.solo.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * unique permutations in any order.
 */
public class Permutations2 {

    public List<List<Integer>> permuteUnique(int[] ints) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(ints);
        boolean[] visited = new boolean[ints.length];
        List<Integer> current = new ArrayList<>();
        backtrack(ints, result, current, visited);
        return result;
    }

    private void backtrack(int[] ints, List<List<Integer>> result, List<Integer> current,
                           boolean[] visited) {
        if (current.size() == visited.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) {
                continue;
            }
            if (i > 0 && ints[i - 1] == ints[i] && !visited[i - 1]) {
                continue;

            }
            current.add(ints[i]);
            visited[i] = true;
            backtrack(ints, result, current, visited);
            visited[i] = false;
            current.remove(current.size() - 1);
        }
    }
}
