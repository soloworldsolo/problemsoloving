package com.solo.algoexpert.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * depth first implementation using STACK
 */
public class DepthFirstSearch {

  static class Node {

    String name;
    ArrayList<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> depthFirstSearch(List<String> array) {
      Node currentNode = this;
      while (currentNode != null) {

      }
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }


}