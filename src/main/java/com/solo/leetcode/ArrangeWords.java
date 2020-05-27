package com.solo.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ArrangeWords {

  public String arrangeWords(String text) {
    String[] arrays = text.split(" ");
    Arrays.sort(arrays, Comparator.comparingInt(String::length));
    String result = String.join(" ", arrays);
    return result.substring(0, 1).toUpperCase() + result.substring(1).toLowerCase();
  }

  public String arrangeWordsPriorityQueue(String text) {
    String[] arrays = text.split(" ");
    Comparator<String> stringByLengthComparator = (a, b) ->
        a.toLowerCase().length() > b.toLowerCase().length() ? 1 : -1;
    PriorityQueue<String> priorityQueue = new PriorityQueue<>(stringByLengthComparator);
    priorityQueue.addAll(Arrays.asList(arrays));
    StringBuilder builder = new StringBuilder();
    while (!priorityQueue.isEmpty()) {
      builder.append(priorityQueue.poll().toLowerCase()).append(" ");
    }
    return builder.toString().stripTrailing();
  }


}
