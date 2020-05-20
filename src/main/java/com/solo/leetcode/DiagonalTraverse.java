package com.solo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class DiagonalTraverse {

  public int[] findDiagonalOrder(List<List<Integer>> nums) {
    List<Integer> result = new ArrayList<>();
    int currentListIndex = 0;
    int currentRound = 0;
    int maximumRound = nums.get(nums.size() - 1).size();

    while (currentRound < maximumRound) {
      result.add(nums.get(currentListIndex).get(currentRound));
      if (currentListIndex > 0) {
        int reverseIndex = currentListIndex - 1;
        int reverseRound = currentRound + 1;
        while (reverseIndex >= 0) {
          if (nums.get(reverseIndex).size() > reverseRound) {
            result.add(nums.get(reverseIndex--).get(reverseRound++));
          } else {
            reverseIndex--;
            reverseRound++;
          }
        }
      }
      if (currentListIndex >= nums.size() - 1) {
        currentRound++;
      } else {
        currentListIndex++;
      }
    }
    int[] resultRaary = new int[result.size()];
    int index = 0;
    for (int res : result) {
      resultRaary[index++] = res;
    }
    return resultRaary;
  }

}
