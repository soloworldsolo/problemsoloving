package com.solo.leetcode.graphtheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses-1.
 *
 * Some courses may have prerequisites, for example to take course 0 you have to first take course
 * 1, which is expressed as a pair: [0,1]
 *
 * Given the total number of courses and a list of prerequisite pairs, is it possible for you to
 * finish all courses?
 */
public class CourseSchedule {

  public boolean canFinish(int numCourses, int[][] prerequisites) {
    //build adjacencyList

    Map<Integer, List<Integer>> adjacencyMap = new HashMap<>();

    for (int i = 0; i < prerequisites.length; i++) {
      int[] dependency = prerequisites[i];
      adjacencyMap.putIfAbsent(dependency[0], new ArrayList<>());
      adjacencyMap.get(dependency[0]).add(dependency[1]);
    }
    boolean[] checked = new boolean[numCourses + 1];
    boolean[] path = new boolean[numCourses + 1];

    for (int currCourse = 0; currCourse < numCourses; ++currCourse) {
      if (this.isCyclic(currCourse, adjacencyMap, checked, path)) {
        return false;
      }
    }

    return true;
  }


  protected boolean isCyclic(
      Integer currCourse, Map<Integer, List<Integer>> courseDict,
      boolean[] checked, boolean[] path) {

    // bottom cases
    if (checked[currCourse])
    // this node has been checked, no cycle would be formed with this node.
    {
      return false;
    }
    if (path[currCourse])
    // come across a previously visited node, i.e. detect the cycle
    {
      return true;
    }

    // no following courses, no loop.
    if (!courseDict.containsKey(currCourse)) {
      return false;
    }

    // before backtracking, mark the node in the path
    path[currCourse] = true;

    boolean ret = false;
    // postorder DFS, to visit all its children first.
    for (Integer child : courseDict.get(currCourse)) {
      ret = this.isCyclic(child, courseDict, checked, path);
      if (ret) {
        break;
      }
    }

    // after the visits of children, we come back to process the node itself
    // remove the node from the path
    path[currCourse] = false;

    // Now that we've visited the nodes in the downstream,
    // we complete the check of this node.
    checked[currCourse] = true;
    return ret;
  }


}
