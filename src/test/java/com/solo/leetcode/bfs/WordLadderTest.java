package com.solo.leetcode.bfs;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordLadderTest {

  private WordLadder wordLadder;

  @BeforeEach
  void setUp() {
    wordLadder = new WordLadder();
  }

  @Test
  void positiveTestCase() {
    var startWord = "hit";
    var endWord = "cog";
    var input = List.of("hot", "dot", "dog", "lot", "log", "cog");
    Assertions.assertEquals(5, wordLadder.wordLadder(startWord, endWord, input));

  }

  @Test
  void failesTestCase() {
    var startWord = "hot";
    var endWord = "dog";
    var input = List.of("hot", "dog");
    Assertions.assertEquals(0, wordLadder.wordLadder(startWord, endWord, input));

  }

  @Test
  void failesTestCase1() {
    var startWord = "hot";
    var endWord = "dog";
    var input = List.of("hot", "dog", "dot");
    Assertions.assertEquals(3, wordLadder.wordLadder(startWord, endWord, input));

  }

  @Test
  void failesTestCase11() {
    var startWord = "leet";
    var endWord = "code";
    var input = List.of("lest", "leet", "lose", "code", "lode", "robe", "lost");
    Assertions.assertEquals(6, wordLadder.wordLadder(startWord, endWord, input));

  }
}