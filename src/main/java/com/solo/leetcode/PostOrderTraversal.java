package com.solo.leetcode;

import com.solo.trees.bst.Node;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PostOrderTraversal {

  public List<Integer> traverse(Node node) {
    List<Integer> result = new ArrayList<>();
    Node currentNode = node;
    Deque<Node> nodeStack = new ArrayDeque<>();
    while (currentNode != null || !nodeStack.isEmpty()) {
      while (currentNode != null) {
        if (currentNode.getRightnode() != null) {
          nodeStack.push(currentNode.getRightnode());
        }
        nodeStack.push(currentNode);
        currentNode = currentNode.getLeftnode();
      }
      currentNode = nodeStack.pop();
      if (!nodeStack.isEmpty() && nodeStack.peek() == currentNode.getRightnode()) {
        nodeStack.pop();
        nodeStack.push(currentNode);
        currentNode = currentNode.getRightnode();
      } else {
        result.add(currentNode.getValue());
        currentNode = null;
      }
    }
    return result;

  }
}

