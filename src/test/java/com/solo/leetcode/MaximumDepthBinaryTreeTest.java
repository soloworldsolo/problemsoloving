package com.solo.leetcode;

import com.solo.leetcode.BinaryTree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaximumDepthBinaryTreeTest {

  MaximumDepthBinaryTree maximumDepthBinaryTree;

  @BeforeEach
  void setUp() {
    maximumDepthBinaryTree = new MaximumDepthBinaryTree();
  }

  @Test
  void test1() {
    TreeNode headNode = new TreeNode(3);
    headNode.left = new TreeNode(9);

    headNode.right = new TreeNode(20);
    headNode.right.left = new TreeNode(15);
    headNode.right.right = new TreeNode(7);

    Assertions.assertEquals(2, maximumDepthBinaryTree.minDepth(headNode));
  }

  @Test
  void test2() {
    TreeNode headNode = new TreeNode(1);
    headNode.left = new TreeNode(2);

    headNode.right = new TreeNode(3);
    headNode.left.left = new TreeNode(4);
    headNode.left.right = new TreeNode(5);

    Assertions.assertEquals(2, maximumDepthBinaryTree.minDepth(headNode));
  }

  @Test
  void test2left() {
    TreeNode headNode = new TreeNode(1);
    headNode.left = new TreeNode(2);

    headNode.left.left = new TreeNode(4);
    headNode.left.left.left = new TreeNode(5);
    Assertions.assertEquals(2, maximumDepthBinaryTree.minDepth(headNode));
  }
}