package com.solo.algoexpert.easy;

import java.util.Objects;

/**
 * class to implement to find if the given dtring is palindrome or not uses two pointer approach
 * which gives O(1) space complexity and O( n) time complexity
 */
public class Palindrome {

  public static boolean isPalindrome(String inputString) {
    Objects.requireNonNull(inputString);
    if (inputString.isBlank() || inputString.length() == 1) {
      return false;
    }
    int starting_pointer = 0;
    int end_pointer = inputString.length() - 1;

    while (starting_pointer < end_pointer) {
      if (inputString.charAt(starting_pointer) != inputString.charAt(end_pointer)) {
        return false;
      } else {
        starting_pointer++;
        end_pointer--;
      }
    }
    return true;
  }
}


class Test {

  public static void main(String[] args) {
    System.out.println(Palindrome.isPalindrome(""));
  }
}
