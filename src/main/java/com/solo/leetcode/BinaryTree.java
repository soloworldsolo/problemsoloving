package com.solo.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class BinaryTree {

  public boolean isValidBST(TreeNode head) {

    if (head == null) {
      return true;
    }

    return validateBSTHelper(head, null, null);

  }

  public boolean isValidBSTIteration(TreeNode head) {
    if (head == null) {
      return true;
    }
    Deque<TreeNode> nodeStack = new ArrayDeque<>();
    LinkedList<Integer> minQueue = new LinkedList<>();
    LinkedList<Integer> maxQueue = new LinkedList<>();

    pushElements(nodeStack, minQueue, maxQueue, null, head, null);
    while (!nodeStack.isEmpty()) {
      TreeNode currentNode = nodeStack.pop();
      Integer minValue = minQueue.pop();
      Integer maxValue = maxQueue.pop();
      int val = currentNode.val;
      if (maxValue != null && val >= maxValue) {
        return false;
      }

      if (minValue != null && val <= minValue) {
        return false;
      }
      if (currentNode.right != null) {
        pushElements(nodeStack, minQueue, maxQueue, currentNode.val, currentNode.right, maxValue);

      }
      if (currentNode.left != null) {
        pushElements(nodeStack, minQueue, maxQueue,
            minValue, currentNode.left, currentNode.val);
      }
    }

    return true;
  }

  private void pushElements(Deque<TreeNode> nodeStack, LinkedList<Integer> minQueue,
      LinkedList<Integer> maxQueue, Integer minValue, TreeNode left, Integer val2) {
    nodeStack.add(left);
    minQueue.add(minValue);
    maxQueue.add(val2);
  }


  private boolean validateBSTHelper(TreeNode head, Integer min, Integer max) {

    if (max != null && head.val >= max) {
      return false;
    }

    if (min != null && head.val <= min) {
      return false;
    }
    if (head.left != null && !validateBSTHelper(head.left, min, head.val)) {
      return false;
    }
    if (head.right != null && !validateBSTHelper(head.right, head.val, max)) {
      return false;
    }
    return true;
  }

  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
