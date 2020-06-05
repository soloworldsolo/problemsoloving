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
}