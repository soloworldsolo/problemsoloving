package com.solo.leetcode;

import com.solo.trees.bst.Node;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PostOrderTraversalTest {

  PostOrderTraversal postOrderTraversal;


  @BeforeEach
  void setUp() {
    postOrderTraversal = new PostOrderTraversal();
  }


  @Test
  void test1() {
    Node node = new Node(0);
    node.setLeftnode(new
        Node(1));
    node.setRightnode(new Node(2));
    node.getLeftnode().setLeftnode(new Node(4));
    node.getLeftnode().setRightnode(new Node(5));
    node.getRightnode().setLeftnode(new Node(6));
    node.getRightnode().setRightnode(new Node(7));
    Assertions.assertEquals(List.of(4, 5, 1, 6, 7, 2, 0), postOrderTraversal.traverse(node));
  }
}