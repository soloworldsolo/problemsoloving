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
      if (currentRound + 1 == maximumRound) {
        if (currentListIndex > 0 && nums.get(currentListIndex).size() > currentRound + 1) {
          currentRound += 1;
          maximumRound += 1;
        } else if (currentListIndex > 0
            && nums.get(currentListIndex - 1).size() > currentRound + 2) {
          currentRound += 2;
          maximumRound += 2;
          currentListIndex--;
        } else {
          currentRound++;
          if (currentListIndex > 0 && nums.get(currentListIndex).size() > currentRound) {
            maximumRound++;
          }
        }
      } else {
        if (currentListIndex >= nums.size() - 1) {
          currentRound++;
        } else {
          currentListIndex++;
        }
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
