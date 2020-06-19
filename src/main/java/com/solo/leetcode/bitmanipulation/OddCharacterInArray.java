package com.solo.leetcode.bitmanipulation;

public class OddCharacterInArray {

  public char oddCharacterInArray(String s1, String s2) {
    int result = 0;
    int index = 0;
    while (index < s1.length() || index < s2.length()) {
      int firstIndex = index < s1.length() ? s1.charAt(index) : 0;
      int secondIndex = index < s2.length() ? s2.charAt(index) : 0;

      result ^= firstIndex ^ secondIndex;
      index++;
    }

    return (char) result;
  }
}
