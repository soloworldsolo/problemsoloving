package com.solo.leetcode;

import com.solo.leetcode.BinaryTree.TreeNode;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InOrderTraversalTest {

  InOrderTraversal inOrderTraversal;

  @BeforeEach
  void setUp() {
    inOrderTraversal = new InOrderTraversal();
  }

  @Test
  void happyTest1() {
    TreeNode treeNode = new TreeNode(1);
    treeNode.right = new TreeNode(2);
    treeNode.right.right = new TreeNode(3);
    List<Integer> res = inOrderTraversal.inorderTraversal(treeNode);
  }

  @Test
  void happyTest1Iter() {
    TreeNode treeNode = new TreeNode(1);
    treeNode.left = new TreeNode(2);
    treeNode.right = new TreeNode(3);
    treeNode.left.left = new TreeNode(4);
    treeNode.left.right = new TreeNode(5);
    List<Integer> res = inOrderTraversal.inorderTraversalIteration(treeNode);
  }
}