package com.solo.leetcode;

import com.solo.leetcode.BinaryTree.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class InOrderTraversal {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> inOrder = new ArrayList<>();
    if (root != null) {
      helper(root, inOrder);

    }
    return inOrder;
  }

  public List<Integer> inorderTraversalIteration(TreeNode root) {

    List<Integer> inOrder = new ArrayList<>();
    Deque<TreeNode> nodeSatck = new ArrayDeque<>();
    TreeNode currentNode = root;

    while (currentNode != null || !nodeSatck.isEmpty()) {
      while (currentNode == null) {
        nodeSatck.push(currentNode);
        currentNode = currentNode.left;
      }
      currentNode = nodeSatck.pop();
      inOrder.add(currentNode.val);
      currentNode = currentNode.right;
    }

    return inOrder;
  }

  private void helper(TreeNode root, List<Integer> inOrder) {
    if (root.left != null) {
      helper(root.left, inOrder);

    }
    inOrder.add(root.val);

    if (root.right != null) {
      helper(root.right, inOrder);

    }

  }
}