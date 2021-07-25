package com.solo.leetcode.divideandconquer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.solo.util.TreeNode;
import org.junit.jupiter.api.Test;

class ConstructTreeTest {

  ConstructTree constructTree;

  @Test
  void testTree() {
    constructTree = new ConstructTree();
    TreeNode node = new TreeNode(1);
    node.setLeft(new TreeNode(2));
    node.setRight(new TreeNode(3));
    node.getLeft().setLeft(new TreeNode(4));
    node.getLeft().setRight(new TreeNode(5));

    TreeNode result = constructTree
        .constructTree(new int[]{4, 2, 5, 1, 3}, new int[]{1, 2, 4, 5, 3});
    assertEquals(node.getVal(), result.getVal());
    assertEquals(node.getLeft().getVal(), result.getLeft().getVal());
  }
}