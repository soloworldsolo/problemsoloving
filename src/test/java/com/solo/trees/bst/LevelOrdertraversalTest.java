package com.solo.trees.bst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.solo.util.TreeNode;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LevelOrdertraversalTest {

  private InorderTraversal inorderTraversal;

  @BeforeEach
  void setUp() {
    inorderTraversal = new InorderTraversal();
  }

  @Test
  void test1() {
    TreeNode node = new TreeNode(1);
    node.setRight(new TreeNode(2));
    node.getRight().setLeft(new TreeNode(3));
    List<Integer> result = List.of(1, 3, 2);
    assertEquals(result, inorderTraversal.inorderTraverse(node));
  }
}