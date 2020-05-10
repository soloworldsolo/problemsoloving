package com.solo.leetcode;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same
 * backward as forward.
 *
 * 121 = true
 */
public class PalindromeNumber {

  public boolean palindromeNumber(int x) {
    char[] array = String.valueOf(x).toCharArray();
    int startIndex = 0;
    int endIndex = array.length - 1;
    if (startIndex == endIndex) {
      return true;
    }
    while (startIndex < endIndex) {
      if (array[startIndex] != array[endIndex]) {
        return false;
      }
      startIndex++;
      endIndex--;
    }
    return true;
  }
}
