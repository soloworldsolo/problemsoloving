package com.solo.leetcode.greedyalgorithm;

import java.util.*;
import java.util.Map.Entry;

/**
 * Given a characters array tasks, representing the tasks a CPU needs to do, where each letter
 * represents a different task. Tasks could be done in any order. Each task is done in one unit of
 * time. For each unit of time, the CPU could complete either one task or just be idle.
 * <p>
 * However, there is a non-negative integer n that represents the cooldown period between two same
 * tasks (the same letter in the array), that is that there must be at least n units of time between
 * any two same tasks.
 * <p>
 * Return the least number of units of times that the CPU will take to finish all the given tasks.
 */
public class TaskScheduler {

  public int scheduleTask(char[] tasks, int n) {

    int[] frequencies = new int[26];
    for (int t : tasks) {
      frequencies[t - 'A']++;
    }

    Arrays.sort(frequencies);

    // max frequency
    int f_max = frequencies[25];
    int idle_time = (f_max - 1) * n;

    for (int i = frequencies.length - 2; i >= 0 && idle_time > 0; --i) {
      idle_time -= Math.min(f_max - 1, frequencies[i]);
    }
    idle_time = Math.max(0, idle_time);

    return idle_time + tasks.length;
  }

  public int leastInterval(char[] tasks, int n) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < tasks.length; i++) {
      map.put(tasks[i], map.getOrDefault(tasks[i], 0)
              + 1); // map key is TaskName, and value is number of times to be executed.
    }
    PriorityQueue<Map.Entry<Character, Integer>> q = new PriorityQueue<>( //frequency sort
            (a, b) -> a.getValue() != b.getValue() ? b.getValue() - a.getValue()
                    : a.getKey() - b.getKey());

    q.addAll(map.entrySet());

    int count = 0;
    while (!q.isEmpty()) {
      int k = n + 1;
      List<Entry> tempList = new ArrayList<>();
      while (k > 0 && !q.isEmpty()) {
        Map.Entry<Character, Integer> top = q.poll(); // most frequency task
        top.setValue(top.getValue() - 1); // decrease frequency, meaning it got executed
        tempList.add(top); // collect task to add back to queue
        k--;
        count++; //successfully executed task
      }

      for (Map.Entry<Character, Integer> e : tempList) {
        if (e.getValue() > 0) {
          q.add(e); // add valid tasks
        }
      }

      if (q.isEmpty()) {
        break;
      }
      count = count + k; // if k > 0, then it means we need to be idle
    }
    return count;
  }

  public int scheduleTask1(char[] chars, int cooloftime) {
    if (cooloftime == 0) {
      return chars.length;
    }
    Map<Integer, Integer> charcterMap = new TreeMap<>();
    PriorityQueue<Integer[]> queue = new PriorityQueue<>(
            (a, b) -> a[1] != b[1] ? b[1] - a[1] : a[0] - b[0]);
    Deque<Integer[]> stack = new ArrayDeque<>();
    for (int i = 0; i < chars.length; i++) {
      charcterMap.put((int) chars[i], charcterMap.getOrDefault((int) chars[i], 0) + 1);

    }
    int counter = 0;
    charcterMap.entrySet().stream()
            .forEach(a -> queue.add(new Integer[]{a.getKey(), a.getValue()}));
    while (!stack.isEmpty() || !queue.isEmpty()) {
      int local = cooloftime + 1;
      while (!queue.isEmpty() && local > 0) {
        counter++;
        local--;
        if (queue.peek()[1] > 1) {
          queue.peek()[1]--;
          stack.push(queue.poll());
        } else {
          queue.poll();
        }
      }

      while (!stack.isEmpty()) {
        queue.add(stack.pop());
      }
      if (queue.isEmpty()) {
        break;
      }
      counter += local;
    }

    return counter;
  }
}

