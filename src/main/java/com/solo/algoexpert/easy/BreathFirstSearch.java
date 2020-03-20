package com.solo.algoexpert.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class BreathFirstSearch {


  public String[] DepthFirstSearch(Node root) {
    Node currentNode = Objects.requireNonNull(root);
    Stack<Node> nodeStack = new Stack<>();
    List<String> result = new ArrayList<>();

    while (currentNode != null) {

      result.add(currentNode.name);
      if (currentNode.children != null && !currentNode.children.isEmpty()) {
        for (int i = currentNode.children.size() - 1; i >= 0; i--) {
          nodeStack.push(currentNode.children.get(i));
        }
      }

      currentNode = nodeStack.isEmpty() ? null : nodeStack.pop();
    }
    return Arrays.copyOf(result.toArray(), result.toArray().length, String[].class);

  }

  public static class Node {

    String name;
    ArrayList<Node> children = new ArrayList<>();

    public Node(String name) {
      this.name = name;
    }

    public Node() {

    }


    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }

}


