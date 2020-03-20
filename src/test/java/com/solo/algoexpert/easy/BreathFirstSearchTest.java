package com.solo.algoexpert.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BreathFirstSearchTest {

  private BreathFirstSearch.Node rootNode;
  private BreathFirstSearch breathFirstSearch;


  @BeforeEach
  void setUp() {
    rootNode = prepareNodes();
    breathFirstSearch = new BreathFirstSearch();
  }

  private BreathFirstSearch.Node prepareNodes() {
    BreathFirstSearch.Node rootNode = new BreathFirstSearch.Node("A");
    rootNode.addChild("B");
    rootNode.addChild("C");
    rootNode.addChild("D");

    BreathFirstSearch.Node firstlevel1 = rootNode.children.get(0);
    BreathFirstSearch.Node firstlevel3 = rootNode.children.get(2);
    firstlevel1.addChild("E");
    firstlevel1.addChild("F");
    firstlevel3.addChild("G");
    firstlevel3.addChild("H");

    BreathFirstSearch.Node level2 = firstlevel1.children.get(1);
    level2.addChild("I");
    level2.addChild("J");

    BreathFirstSearch.Node firstlevel3lasr = firstlevel3.children.get(0);
    firstlevel3lasr.addChild("K");
    return rootNode;
  }

  @Test
  void Basecase() {
    String[] result = breathFirstSearch.DepthFirstSearch(rootNode);
    String[] output = {"A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H"};

    Assertions.assertArrayEquals(result, output);
  }
}