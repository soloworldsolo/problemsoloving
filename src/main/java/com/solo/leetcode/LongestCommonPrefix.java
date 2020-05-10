package com.solo.leetcode;

import static java.util.Objects.requireNonNull;

public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {
    requireNonNull(strs);
    if (strs.length == 0) {
      return "";
    }

    StringBuilder prefixBuilder = new StringBuilder();
    Character currentChar = strs[0].length() == 0 ? null : strs[0].charAt(0);
    int charcterIndex = 0;

    while (currentChar != null) {
      for (int i = 0; i < strs.length; i++) {
        if (charcterIndex > strs[i].length() - 1 || strs[i].charAt(charcterIndex) != currentChar) {
          charcterIndex = Integer.MAX_VALUE;
          break;
        }
      }
      if (charcterIndex == Integer.MAX_VALUE) {
        return prefixBuilder.toString();
      }
      prefixBuilder.append(currentChar);
      currentChar = ++charcterIndex > strs[0].length() - 1 ? null : strs[0].charAt(charcterIndex);
    }

    return prefixBuilder.toString();
  }

}
