package com.solo.algoexpert.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * ​You are given an array of integers and an integer. Write a function that moves all instances of
 * that integer in the array to the end of the array. The function should perform this in place and
 * does not need to maintain the order of the other integers.
 *
 * Sample input: [2, 1, 2, 2, 2, 3, 4, 2], 2 Sample output: [1, 3, 4, 2, 2, 2, 2, 2] (the numbers 1,
 * 3, and 4 could be ordered differently)
 */
public class MoveElementToEnd {

  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    Objects.requireNonNull(array, "array input cannot be empty");
    int current_index = 0;
    int end_index = array.size() - 1;
    while (current_index < end_index) {
      if (array.get(current_index) == toMove) {
        if (array.get(end_index) == toMove) {
          while (array.get(end_index) == toMove && current_index < end_index) {
            end_index--;
          }
        }
        int tempValue = array.get(end_index);
        array.set(end_index, array.get(current_index));
        array.set(current_index, tempValue);
        current_index++;

      } else {
        current_index++;
      }
    }
    return array;
  }
}

class MoveElementToLastTest {

  public static void main(String[] args) {
    List<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    int toMove = 3;
    List<Integer> expectedStart = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5));
    List<Integer> result = MoveElementToEnd.moveElementToEnd(array, toMove);
  }
}