package com.solo.leetcode.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given an array of distinct integers candidates and a target integer target, return a list of all
 * unique combinations of candidates where the chosen numbers sum to target. You may return the
 * combinations in any order.
 *
 * The same number may be chosen from candidates an unlimited number of times. Two combinations are
 * unique if the frequency of at least one of the chosen numbers is different.
 *
 * It is guaranteed that the number of unique combinations that sum up to target is less than 150
 * combinations for the given input.
 */
public class CombinationSum {

  List<List<Integer>> result = new ArrayList<>();

  public List<List<Integer>> combinationSum(int[] ints, int sum) {

    compute(ints, 0, new LinkedList<>(), 0, sum);
    return result;
  }

  private void compute(int[] ints, int startValue, LinkedList<Integer> currentList,
      int currentValue,
      int sum) {

    if (currentValue == sum) {
      result.add(new ArrayList<>(currentList));
    }

    if (currentValue > sum) {
      return;
    }

    for (int i = startValue; i < ints.length; i++) {
      int value = ints[i];
      currentList.add(value);
      compute(ints, i, currentList, currentValue + value, sum);
      currentList.removeLast();
    }

  }

}

