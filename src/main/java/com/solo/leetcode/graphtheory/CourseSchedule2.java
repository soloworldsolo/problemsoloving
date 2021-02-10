package com.solo.leetcode.graphtheory;


import static java.util.Objects.nonNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * There are a total of n courses you have to take labelled from 0 to n - 1.
 *
 * Some courses may have prerequisites, for example, if prerequisites[i] = [ai, bi] this means you
 * must take the course bi before the course ai.
 *
 * Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]] Output: [0,2,1,3]
 */
public class CourseSchedule2 {

  public int[] findOrder(int numCourses, int[][] prerequisites) {
    Objects.requireNonNull(prerequisites, "prerequists cannot be null");
    LinkedList<Integer> result = new LinkedList<>();
    boolean[] visited = new boolean[numCourses];
    boolean[] cycle = new boolean[numCourses];
    Map<Integer, List<Integer>> preRequistMap = new HashMap<>();
    for (int[] pre : prerequisites) {
      preRequistMap.putIfAbsent(pre[0], new ArrayList<>());
      preRequistMap.get(pre[0]).add(pre[1]);
    }
    for (int i = 0; i < numCourses; i++) {
      if (calculateOrder(result, preRequistMap, visited, cycle, i)) {
        return new int[]{};
      }
    }
    return convetToList(result);
  }

  private int[] convetToList(List<Integer> result) {
    int[] res = new int[result.size()];
    int i = 0;
    for (int re : result) {
      res[i] = re;
      i++;
    }
    return res;
  }

  private boolean calculateOrder(LinkedList<Integer> result,
      Map<Integer, List<Integer>> preRequistMap,
      boolean[] visited, boolean[] cycle, int courseId) {
    if (visited[courseId]) {
      return false;
    }
    if (cycle[courseId]) {
      return true;
    }
    cycle[courseId] = true;
    boolean cycl = false;
    List<Integer> dependencyMap = preRequistMap.get(courseId);
    if (nonNull(dependencyMap) && !dependencyMap.isEmpty()) {
      for (Integer courseID : dependencyMap) {
        if (calculateOrder(result, preRequistMap, visited, cycle, courseID)) {
          cycl = true;
          break;
        }
      }
      addToResult(result, visited, cycle, courseId);
    } else {
      addToResult(result, visited, cycle, courseId);

    }
    return cycl;
  }

  private void addToResult(LinkedList<Integer> result, boolean[] visited, boolean[] cycle,
      int courseId) {
    if (!visited[courseId]) {
      result.addLast(courseId);
      visited[courseId] = true;
    }
    cycle[courseId] = false;
  }

}
