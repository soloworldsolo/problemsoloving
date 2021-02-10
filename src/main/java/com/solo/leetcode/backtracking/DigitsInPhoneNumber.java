package com.solo.leetcode.backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that
 * the number could represent. Return the answer in any order.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1
 * does not map to any letters.
 */
public class DigitsInPhoneNumber {

  public List<String> letterCombinations(String digits) {
    List<String> lookupString = List
        .of("0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
    LinkedList<String> result = new LinkedList<>();
    if (digits.isEmpty()) {
      return result;
    }
    result.add("");
    while (result.peek().length() != digits.length()) {
      String baseString = result.poll();
      String map = lookupString.get(digits.charAt(baseString.length()) - '0');

      for (char character : map.toCharArray()) {
        result.add(baseString + character);
      }
    }

    return result;
  }
}
