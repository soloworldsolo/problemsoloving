package com.solo.algoexpert.medium.bst;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class InverseBinaryTree {

  /**
   *
   */
  public static void invertBinaryTree(BinaryTree tree) {
    Objects.requireNonNull(tree, "input cannot be empty");
    Queue<BinaryTree> binaryTreeQueue = new ArrayDeque<>();
    BinaryTree curentNode = tree;
    while (curentNode != null) {
      if (curentNode.left != null) {
        binaryTreeQueue.add(curentNode.left);
      }
      if (curentNode.right != null) {
        binaryTreeQueue.add(curentNode.right);
      }
      BinaryTree tempNode = curentNode.left;
      curentNode.left = curentNode.right;
      curentNode.right = tempNode;
      curentNode = binaryTreeQueue.isEmpty() ? null : binaryTreeQueue.poll();

    }

  }

  static class BinaryTree {

    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

}
