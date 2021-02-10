package com.solo.leetcode.graphtheory.dfs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RearrangeItenaryTest {

  RearrangeItenary rearrangeItenary;


  @BeforeEach
  void setUp() {
    rearrangeItenary = new RearrangeItenary();
  }


  @Test
  void testcase1() {
    var schuffeledList = List.of(List.of("MUC", "LHR"),
        List.of("JFK", "MUC"), List.of("SFO", "SJC"), List.of("LHR", "SFO"));

    assertEquals(List.of("JFK", "MUC", "LHR", "SFO", "SJC"),
        rearrangeItenary.findItinerary(schuffeledList));
  }

  @Test
  void testcaseTLE() {
    var schuffeledList = List.of(List.of("JFK", "SFO"),
        List.of("JFK", "ATL"), List.of("SFO", "ATL"), List.of("ATL", "JFK"), List.of("ATL", "SFO"));

    assertEquals(List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"),
        rearrangeItenary.findItinerary(schuffeledList));
  }

  @Test
  void testcase2() {
    var schuffeledList = List.of(List.of("JFK", "KUL"),
        List.of("JFK", "NRT"), List.of("NRT", "JFK"));

    assertEquals(List.of("JFK", "NRT", "JFK", "KUL"),
        rearrangeItenary.findItinerary(schuffeledList));
  }
}