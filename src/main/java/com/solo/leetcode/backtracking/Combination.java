package com.solo.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * <p>
 * You may return the answer in any order.
 */
public class Combination {

    public List<List<Integer>> combination(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        dfs(n, k, current, result, 1);
        return result;
    }

    private void dfs(int n, int k, List<Integer> current, List<List<Integer>> result, int currentIndex) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = currentIndex; i <= n; i++) {
            current.add(i);
            dfs(n, k, current, result, i + 1);
            current.remove(current.size() - 1);
        }

    }
}
