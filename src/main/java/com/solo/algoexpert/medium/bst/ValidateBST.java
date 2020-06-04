package com.solo.algoexpert.medium.bst;

import java.util.Objects;
import java.util.Stack;

/**
 * o children nodes stored in properties called "left" and "right," respectively. Children nodes can
 * either be Binary Tree nodes themselves or the None (null) value. Write a function that returns a
 * boolean representing whether or not the Binary Tree is a valid BST. A node is said to be a BST
 * node if and only if it satisfies the BST property: its value is strictly greater than the values
 * of every node to its left; its value is less than or equal to the values of every node to its
 * right; and both of its children nodes are either BST nodes themselves or None (null) values.
 */
public class ValidateBST {

  public static boolean validateBst(BST tree) {
    Objects.requireNonNull(tree, "input should not be empty");
    int lowerBound = Integer.MIN_VALUE;
    int upperBound = Integer.MAX_VALUE;
    Stack<BST> bstStack = new Stack<>();
    Stack<Integer[]> integerStack = new Stack<>();
    BST currentNode = tree;
    while (currentNode != null) {
      if (isValidNode(currentNode, lowerBound, upperBound)) {
        if (currentNode.right != null) {
          bstStack.push(currentNode);
          integerStack.push(new Integer[]{lowerBound, upperBound});
          upperBound = currentNode.value;
          currentNode = currentNode.left;

          if (currentNode == null && !bstStack.isEmpty()) {
            currentNode = bstStack.pop();
            Integer[] boundArray = integerStack.pop();
            lowerBound = boundArray[0];
            upperBound = boundArray[1];
            if (currentNode != null) {
              lowerBound = currentNode.value;
              currentNode = currentNode.right;
            }

          }
        } else if (currentNode.left != null) {
          upperBound = currentNode.value;
          currentNode = currentNode.left;
        } else if (currentNode.left == null && currentNode.right == null) {

          if (!bstStack.isEmpty()) {
            currentNode = bstStack.pop();
            Integer[] boundArray = integerStack.pop();
            lowerBound = boundArray[0];
            upperBound = boundArray[1];
            if (currentNode != null) {
              lowerBound = currentNode.value;
              currentNode = currentNode.right;
            }
          } else {
            return isValidNode(currentNode, lowerBound, upperBound);
          }


        }
      } else {
        return false;
      }
    }
    return true;
  }

  private static boolean isValidNode(BST currentNode, int lowerBound, int upperBound) {
    if (!(currentNode.value >= lowerBound)) {
      return false;
    }
    if (!(currentNode.value < upperBound)) {
      return false;
    }

    if (currentNode.left != null) {
      if (!(currentNode.left.value < currentNode.value)) {
        return false;
      }

    }
    if (currentNode.right != null) {
      if (!(currentNode.right.value >= currentNode.value)) {
        return false;
      }
    }
    return true;
  }


  static class BST {

    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }


}

class BSTValidateTest extends ValidateBST.BST {

  public BSTValidateTest(int vale) {
    super(vale);
  }


  public BSTValidateTest insert(int value) {
    ValidateBST.BST current = null;
    if (value < this.value) {
      if (this.left == null) {
        ValidateBST.BST newBST = new ValidateBST.BST(value);
        this.left = newBST;
        return this;
      } else {
        current = this.left;
      }
    } else {
      if (right == null) {
        ValidateBST.BST newBST = new ValidateBST.BST(value);
        this.right = newBST;
        return this;
      } else {
        current = this.right;
      }
    }
    while (true) {
      if (value < current.value) {
        if (current.left == null) {
          ValidateBST.BST newBST = new ValidateBST.BST(value);
          current.left = newBST;
          return this;
        } else {
          current = current.left;
        }
      } else {
        if (current.right == null) {
          ValidateBST.BST newBST = new ValidateBST.BST(value);
          current.right = newBST;
          return this;
        } else {
          current = current.right;
        }
      }
    }
  }

  public static void main(String[] args) {
    BSTValidateTest test;
    test = new BSTValidateTest(10);
    test.insert(5).insert(15).insert(5).insert(2).insert(1).insert(22).insert(13).insert(14)
    ;
    //test.left.right.right = new BSTValidateTest(11);
  }
}
