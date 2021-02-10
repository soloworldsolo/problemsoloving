package com.solo.leetcode.bfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OpenLockTest {

  private OpenLock openLock;

  @BeforeEach
  void setUp() {
    openLock = new OpenLock();
  }


  @Test
  void testOpenLock() {
    String[] deadEnds = {"0201", "0101", "0102", "1212", "2002"};
    Assertions.assertEquals(6, openLock.openLock(deadEnds, "0202"));
  }
}