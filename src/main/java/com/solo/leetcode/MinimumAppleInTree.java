package com.solo.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumAppleInTree {

  /**
   * working up to one level , for level greater than 2 not working
   */
  public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
    Map<Integer, Deque<Integer>> appleNodeMap = buildAppleTree(edges, hasApple);
    return dfs(edges, hasApple, appleNodeMap, n);
  }

  private int dfs(int[][] edges, List<Boolean> hasApple,
      Map<Integer, Deque<Integer>> appleNodeMap, int n) {

    return -1;
  }

  private Map<Integer, Deque<Integer>> buildAppleTree(int[][] edges, List<Boolean> hasApple) {
    Map<Integer, Deque<Integer>> appleNodeMap = new HashMap<>();
    for (int[] edge : edges) {
      var parentNode = appleNodeMap
          .getOrDefault(edge[0], new ArrayDeque<>());

      var childNode = appleNodeMap
          .getOrDefault(edge[1], new ArrayDeque<>());
      parentNode.push(edge[1]);
      childNode.push(edge[0]);
      appleNodeMap.putIfAbsent(edge[0], parentNode);
      appleNodeMap.putIfAbsent(edge[1], childNode);
    }

    return appleNodeMap;
  }

  private int dfs(int[][] edges, List<Boolean> hasApple) {
    int result = 0;
    Map<Integer, List<Integer>> parent = new HashMap<>();
    boolean[] marked = new boolean[hasApple.size()];
    for (int[] edge : edges) {
      List<Integer> children = parent.getOrDefault(edge[0], new ArrayList<>());
      children.add(edge[1]);
      parent.put(edge[0], children);
      List<Integer> reverse = parent.getOrDefault(edge[1], new ArrayList<>());
      reverse.add(edge[0]);
      parent.put(edge[1], reverse);

    }
    int i = 0;
    for (Boolean isApple : hasApple) {
      if (isApple && i != 0) {
        result += 2;
        int localNode = i;
        List<Integer> parentList = parent.getOrDefault(localNode, new ArrayList<>());
        int localResult = 0;
        while (!parentList.isEmpty()) {
          for (int par : parentList) {
            if (par != i) {
              if (!hasApple.get(par) && par != 0) {
                result += 2;
                break;
              }
            }
          }
        }
        if (localResult != 0) {
          result += localResult;
          if (localNode == 0) {
            parentList = Collections.emptyList();
          }
        }

      }
      i++;
    }
    return result;
  }


}
