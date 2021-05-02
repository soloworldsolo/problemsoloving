package com.solo.leetcode.backtracking;

/**
 * The set [1, 2, 3, ..., n] contains a total of n! unique permutations.
 * <p>
 * By listing and labeling all of the permutations in order, we get the following sequence for n = 3:
 * <p>
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * Given n and k, return the kth permutation sequence.
 */
public class PermutationSequence {
    int counter;

    public String getPermuation(int n, int k) {
        String current = "";
        counter = k;
        return dfs(n, current, 1, new boolean[n + 1]);

    }

    private String dfs(int n, String current, int index, boolean[] visited) {
        if (current.length() == n) {
            if (counter == 1) {
                return current;
            }
            counter--;
        }

        for (int i = index; i < n + 1; i++) {
            if (visited[i]) {
                continue;
            }
            current = current + i;
            visited[i] = true;
            dfs(n, current, i + 1, visited);
            current = current.substring(0, current.length() - 1);
            visited[i] = false;
        }
        return current;
    }
}
