package com.solo.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of candidate numbers (candidates) and a target number (target), find all
 * unique combinations in candidates where the candidate numbers sum to target.
 * <p>
 * Each number in candidates may only be used once in the combination.
 * <p>
 * Note: The solution set must not contain duplicate combinations.
 */
public class CombinationalSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        combination(result, candidates, target, 0, 0, new ArrayList<>());
        return result;
    }

    private void combination(List<List<Integer>> result, int[] candidates, int target,
                             int currentIndex, int current, List<Integer> currentList) {

        if (current == target) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        if (current > target) {
            return;
        }

        for (int i = currentIndex; i < candidates.length; i++) {
            if (i > currentIndex && candidates[i] == candidates[i - 1]) {
                continue;
            }
            current = current + candidates[i];
            currentList.add(candidates[i]);
            combination(result, candidates, target, i + 1, current, currentList);
            current = current - currentList.get(currentList.size() - 1);
            currentList.remove(currentList.size() - 1);
        }

    }


}
