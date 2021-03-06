package com.solo.leetcode;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.TreeMap;

public class DiagonalTraverse {

  /**
   * calculate the sum of index and group them by their diagonal value
   *
   * @return array of integer
   */
  public int[] findDiagonalOrder(List<List<Integer>> nums) {
    var integerListHashMap = new TreeMap<Integer, Deque<Integer>>();
    for (int i = 0; i < nums.size(); i++) {
      for (int j = 0; j < nums.get(i).size(); j++) {
        if (integerListHashMap.containsKey(i + j)) {
          integerListHashMap.get(i + j).push(nums.get(i).get(j));
        } else {
          Deque<Integer> integerList = new ArrayDeque<>();
          integerList.push(nums.get(i).get(j));
          integerListHashMap.put(i + j, integerList);
        }
      }
    }

    return integerListHashMap.entrySet().stream()
        .flatMap(map -> map.getValue().stream()).mapToInt(Integer::intValue).toArray();

  }

}

