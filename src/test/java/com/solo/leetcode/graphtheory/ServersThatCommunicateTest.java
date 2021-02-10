package com.solo.leetcode.graphtheory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServersThatCommunicateTest {

  private ServersThatCommunicate serversThatCommunicate;

  @BeforeEach
  void setUp() {
    serversThatCommunicate = new ServersThatCommunicate();
  }

  @Test
  void test1() {
    int[][] input = {{1, 0}, {0, 1}};
    assertEquals(0, serversThatCommunicate.getActiveServerCounts(input));
  }

  @Test
  void test2() {
    int[][] input = {{1, 0}, {1, 1}};
    assertEquals(3, serversThatCommunicate.getActiveServerCounts(input));
  }

  @Test
  void test3() {
    int[][] input = {{1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
    assertEquals(4, serversThatCommunicate.getActiveServerCounts(input));
  }

  @Test
  void test4() {
    int[][] input = {{1, 0, 0, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 1, 0}};
    assertEquals(3, serversThatCommunicate.getActiveServerCounts(input));
  }

}