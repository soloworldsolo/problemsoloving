package com.solo.algoexpert.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * algo expert fibonocci implementation of fibonacci using memoisation tehnique
 */
public class Fibonacci {

  public static Integer calculateFibonacciRecursion(Integer input) {
    Objects.requireNonNull(input, "input cannot be empty ");

    Map<Integer, Integer> memoisationMap = new HashMap<>();
    memoisationMap.put(1, 0);
    memoisationMap.put(2, 1);

    if (memoisationMap.get(input) == null) {
      int lhs = calculateFibonacciRecursion(input - 1);
      int rhs = calculateFibonacciRecursion(input - 2);
      int result = lhs + rhs;
      memoisationMap.put(input, result);
      return result;
    } else {
      return memoisationMap.get(input);
    }

  }

  /**
   * calculates the nth fibonacci in o(n) space complexity eliminates the o(n) space in recursion
   *
   * @return Integer
   */
  public static Integer calculateFibonacciIteration(Integer input) {
    Objects.requireNonNull(input, "input cannot be empty ");

    int previousValue = 0;
    int currentValue = 1;

    for (int i = 3; i <= input; i++) {
      int computedValue = currentValue + previousValue;
      previousValue = currentValue;
      currentValue = computedValue;
    }

    return currentValue;
  }

}

