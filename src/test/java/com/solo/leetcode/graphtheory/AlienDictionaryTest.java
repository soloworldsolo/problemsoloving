package com.solo.leetcode.graphtheory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlienDictionaryTest {

  private AlienDictionary alienDictionary;

  @BeforeEach
  void setUp() {
    alienDictionary = new AlienDictionary();
  }

  @Test
  void testcase1() {
    String[] words = {"wrt", "wrf", "er", "ett", "rftt"};
    assertEquals("wertf", alienDictionary.alienOrders(words));
  }

  @Test
  void testcase2() {
    String[] words = {"z", "x"};
    assertEquals("zx", alienDictionary.alienOrders(words));
  }

  @Test
  void testcase3() {
    String[] words = {"z", "x", "z"};
    assertEquals("", alienDictionary.alienOrders(words));
  }


}