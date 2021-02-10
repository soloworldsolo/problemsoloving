package com.solo.leetcode.graphtheory.dfs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1,
 * and each room may have some keys to access the next room.
 *
 * Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer in [0,
 * 1, ..., N-1] where N = rooms.length.  A key rooms[i][j] = v opens the room with number v.
 *
 * Initially, all the rooms start locked (except for room 0).
 *
 * You can walk back and forth between rooms freely.
 *
 * Return true if and only if you can enter every room.
 */
class KeysAndRoom {

  public boolean isallRoomsAccessible(List<List<Integer>> rooms) {
    Set<Integer> visitedSet = new HashSet<>();
    boolean[] visitedRooms = new boolean[rooms.size()];
    int i = 0;
    while (i < rooms.size()) {
      if (i > 0) {
        visitedRooms[i - 1] = true;
      }
      for (Integer currentKeys : rooms.get(i)) {
        if (!visitedRooms[i]) {
          visitedSet.add(currentKeys);
        }
      }
      i++;
    }
    return visitedSet.size() == rooms.size() - 1;
  }

  public boolean isAllRoomAccesibleDFS(List<List<Integer>> rooms) {
    Set<Integer> visitedRooms = new HashSet<>();
    Map<Integer, List<Integer>> adjacencyMap = adjacencyMap(rooms);
    Deque<Integer> roomStack = new ArrayDeque<>();
    roomStack.add(0);
    while (!roomStack.isEmpty()) {
      if (!visitedRooms.contains(roomStack.peek())) {
        visitedRooms.add(roomStack.peek());
        roomStack.addAll(
            rooms.get(roomStack.peek())
        );
      } else {
        if (!roomStack.isEmpty()) {
          roomStack.pop();
        }
      }
    }
    return visitedRooms.size() == rooms.size();
  }

  private Map<Integer, List<Integer>> adjacencyMap(List<List<Integer>> rooms) {
    Map<Integer, List<Integer>> adjacencyMap = new HashMap<>();
    for (int i = 0; i < rooms.size(); i++) {
      adjacencyMap.put(i, rooms.get(i));
    }
    return adjacencyMap;
  }

}
