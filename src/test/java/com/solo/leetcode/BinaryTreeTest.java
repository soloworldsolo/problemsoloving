package com.solo.leetcode;

import com.solo.leetcode.BinaryTree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

  BinaryTree binaryTree;

  @BeforeEach
  void setUp() {
    binaryTree = new BinaryTree();
  }

  @Test
  void test1() {
    TreeNode treeNode = new TreeNode(5);
    treeNode.left = new TreeNode(1);
    treeNode.right = new TreeNode(4);
    treeNode.right.left = new TreeNode(3);
    treeNode.right.right = new TreeNode(6);

    Assertions.assertFalse(binaryTree.isValidBST(treeNode));

  }

  @Test
  void test3() {
    TreeNode treeNode = new TreeNode(10);
    treeNode.left = new TreeNode(5);
    treeNode.right = new TreeNode(15);
    treeNode.right.left = new TreeNode(6);
    treeNode.right.right = new TreeNode(20);

    Assertions.assertFalse(binaryTree.isValidBST(treeNode));

  }

  @Test
  void test2() {
    TreeNode treeNode = new TreeNode(1);
    treeNode.left = new TreeNode(1);

    Assertions.assertFalse(binaryTree.isValidBST(treeNode));

  }
}