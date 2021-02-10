package com.solo.leetcode.graphtheory.dfs;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KeysAndRoomTest {

  private KeysAndRoom keysAndRoom;

  @BeforeEach
  void setUp() {
    keysAndRoom = new KeysAndRoom();
  }

  @Test
  void test1() {
    var input = List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0));

    assertFalse(keysAndRoom.isallRoomsAccessible(input));
  }

  @Test
  void test2() {
    List<List<Integer>> input = new ArrayList<>();
    List<Integer> item1 = new ArrayList<>();
    item1.add(1);
    input.add(item1);
    List<Integer> item2 = new ArrayList<>();
    item2.add(2);
    input.add(item2);
    List<Integer> item3 = new ArrayList<>();
    List<Integer> item4 = new ArrayList<>();
    item3.add(3);
    input.add(item3);
    input.add(item4);
    assertTrue(keysAndRoom.isAllRoomAccesibleDFS(input));
  }
}