package com.solo.leetcode.bitmanipulation;

public class MaximumProductWordLength {

  public int maximumProduct(String[] words) {
    int maximum = 0;
    for (int i = 0; i < words.length - 1; i++) {
      for (int j = i + 1; j < words.length; j++) {
        if (commonWordsNotPresent(words[i], words[j])) {
          maximum = Math.max(maximum, words[i].length() * words[j].length());
        }

      }
    }
    return maximum;
  }

  private boolean commonWordsNotPresent(String word, String word1) {
    int firstWord = 0;
    int secondWord = 0;
    int i = 0;
    while (i < word.length()) {

      firstWord |= (1 << getCharacterDifference(word.charAt(i)));
      i++;
    }
    i = 0;
    while (i < word1.length()) {
      secondWord |= (1 << getCharacterDifference(word1.charAt(i)));
      i++;
    }
    return (firstWord & secondWord) == 0;
  }

  private int getCharacterDifference(char charAt) {
    return (int) charAt - (int) 'a';
  }
}
