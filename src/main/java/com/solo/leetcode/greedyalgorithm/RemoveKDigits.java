package com.solo.leetcode.greedyalgorithm;

import java.util.LinkedList;

/**
 * Given a non-negative integer num represented as a string, remove k digits from the number so that
 * the new number is the smallest possible.
 */
public class RemoveKDigits {


  public String removeDigits(String num, int k) {
    if (k >= num.length()) {
      return 0 + "";
    }
    LinkedList<Character> list = new LinkedList<>();
    for (char ch : num.toCharArray()) {
      while (list.size() > 0 && k > 0 && list.peekLast() > ch) {
        k--;
        list.removeLast();
      }
      list.addLast(ch);
    }
    StringBuilder builder = new StringBuilder();
    while (!list.isEmpty()) {
      builder.append(String.valueOf(list.poll()));
    }
    if (builder.toString().isEmpty()) {
      return 0 + "";
    }
    return Integer.valueOf(builder.toString()) + "";
  }


}
