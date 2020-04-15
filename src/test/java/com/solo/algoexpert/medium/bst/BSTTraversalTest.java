package com.solo.algoexpert.medium.bst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BSTTraversalTest {

  TestBST bstTraversal;
  TestBST bstTraversal2;
  TestBST bstTraversal3;

  @BeforeEach
  void setUp() {
    bstTraversal = new TestBST(100);
    this.bstTraversal
        .insert(5)
        .insert(15)
        .insert(5)
        .insert(2)
        .insert(1)
        .insert(22)
        .insert(1)
        .insert(1)
        .insert(3)
        .insert(1)
        .insert(1)
        .insert(502)
        .insert(55000)
        .insert(204)
        .insert(205)
        .insert(207)
        .insert(206)
        .insert(208)
        .insert(203);

     bstTraversal2 = new TestBST(10);
     bstTraversal2.insert(5);
     bstTraversal2.insert(15);
     bstTraversal2.insert(5);
     bstTraversal2.insert(2);
     bstTraversal2.insert(1);
     bstTraversal2.insert(22);

     bstTraversal3 = new TestBST(4);
     bstTraversal3.insert(2).insert(7).
         insert(5).insert(1).insert(3);
  }



  @Test
  void preOrderTraverse() {
    List<Integer> result = new ArrayList<>();
    List<Integer> expected =
        new ArrayList<>(
            Arrays.asList(
                1, 1, 1, 1, 1, 2, 3, 5, 5, 15, 22, 100, 203, 204, 205, 206, 207, 208, 502, 55000));
    Assertions.assertEquals(expected, BSTTraversal.inOrderTraverse(bstTraversal, result));
  }

  @Test
  void postOrderTraversalTest() {
    List<Integer> result = new ArrayList<>();
    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,2,5,5,22,15,10));
    Assertions.assertEquals(expected,BSTTraversal.postOrderTraverse(bstTraversal2,result));
  }

  @Test
  void postOrderTraversalTestGeekforgeeks() {
    List<Integer> result = new ArrayList<>();
    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,3,2,5,7,4));
    Assertions.assertEquals(expected,BSTTraversal.postOrderTraverse(bstTraversal3,result));
  }



  class TestBST extends BSTTraversal.BST {

    public TestBST(int value) {
      super(value);
    }

    public TestBST insert(int value) {
      BSTTraversal.BST current = null;
      if (value < this.value) {
        if (this.left == null) {
          BSTTraversal.BST newBST = new BSTTraversal.BST(value);
          this.left = newBST;
          return this;
        } else {
          current = this.left;
        }
      } else {
        if (right == null) {
          BSTTraversal.BST newBST = new BSTTraversal.BST(value);
          this.right = newBST;
          return this;
        } else {
          current = this.right;
        }
      }
      while (true) {
        if (value < current.value) {
          if (current.left == null) {
            BSTTraversal.BST newBST = new BSTTraversal.BST(value);
            current.left = newBST;
            return this;
          } else {
            current = current.left;
          }
        } else {
          if (current.right == null) {
            BSTTraversal.BST newBST = new BSTTraversal.BST(value);
            current.right = newBST;
            return this;
          } else {
            current = current.right;
          }
        }
      }
    }
  }
}