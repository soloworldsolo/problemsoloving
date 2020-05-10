package com.solo.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

  LongestCommonPrefix longestCommonPrefix;

  @BeforeEach
  void setUp() {
    longestCommonPrefix = new LongestCommonPrefix();
  }

  @Test
  void happyCase() {
    Assertions.assertEquals("fl",
        longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
  }

  @Test
  void FailedTest() {
    Assertions.assertEquals("",
        longestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
  }

  @Test
  void FailedTest1() {
    Assertions.assertEquals("",
        longestCommonPrefix.longestCommonPrefix(new String[]{""}));
  }

  @Test
  void FailedTestd() {
    Assertions.assertEquals("d",
        longestCommonPrefix.longestCommonPrefix(new String[]{"d", "d"}));
  }

  @Test
  void FailedTesta() {
    Assertions.assertEquals("a",
        longestCommonPrefix.longestCommonPrefix(new String[]{"aa", "a"}));
  }
}