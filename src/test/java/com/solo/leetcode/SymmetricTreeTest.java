package com.solo.leetcode;

import com.solo.leetcode.BinaryTree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SymmetricTreeTest {

  SymmetricTree symmetricTree;

  @BeforeEach
  void setUp() {
    symmetricTree = new SymmetricTree();
  }

  @Test
  void positiveCase() {
    TreeNode treeNode = new TreeNode(1);
    treeNode.left = new TreeNode(2);
    treeNode.left.left = new TreeNode(3);
    treeNode.left.right = new TreeNode(4);
    treeNode.right = new TreeNode(2);
    treeNode.right.left = new TreeNode(4);
    treeNode.right.right = new TreeNode(3);

    Assertions.assertTrue(symmetricTree.isSymmetricTree(treeNode));

  }
}