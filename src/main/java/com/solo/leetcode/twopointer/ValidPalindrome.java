package com.solo.leetcode.twopointer;

/**
 * Given a string s, determine if it is a palindrome, considering only alphanumeric characters and
 * ignoring cases.
 */
public class ValidPalindrome {

  public boolean isPalidrome(String input) {
    if (input.length() == 1) {
      return true;
    }
    StringBuilder builder = new StringBuilder();
    for (char ch : input.toCharArray()) {
      if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {
        builder.append(Character.toLowerCase(ch));
      }
    }
    int startIndex = 0;
    char[] inputarr = builder.toString().toCharArray();
    int endIndex = inputarr.length - 1;

    while (endIndex > startIndex) {
      if (inputarr[startIndex] != inputarr[endIndex]) {
        return false;
      }
      startIndex++;
      endIndex--;
    }
    return true;
  }


}
