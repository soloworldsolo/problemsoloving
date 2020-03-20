package com.solo.algoexpert.easy;

import static java.lang.Math.abs;

import java.util.Objects;

public class NearestNeighbourBST {

  public static int findClosestValueInBst(BST tree, int target) {
    Objects.requireNonNull(tree, "input tree was empty");
    BST cureent = tree;
    int closestValue = abs(tree.value - target);
    int result = tree.value;
    while (cureent != null) {

      if (abs(cureent.value - target) < closestValue) {
        closestValue = abs(cureent.value - target);
        result = cureent.value;
      }

      if (cureent.value < target) {
        if (cureent.right == null) {
          return result;
        }

        cureent = cureent.right;
      } else if (cureent.value > target) {
        if (cureent.left == null) {
          return result;
        }

        cureent = cureent.left;
      }

    }

    return result;

  }

  public static void main(String[] args) {
    BST parent = new BST(10);

    BST parant_left = new BST(3);
    BST parant_right = new BST(15);

    parent.left = parant_left;
    parent.right = parant_right;

    BST first_left_left = new BST(2);
    BST first_left_right = new BST(5);

    parant_left.left = first_left_left;
    parant_left.right = first_left_right;

    BST first_right_left = new BST(13);
    BST first_right_right = new BST(22);

    parant_right.left = first_right_left;
    parant_right.right = first_right_right;

    BST leveltwo = new BST(1);

    first_left_left.left = leveltwo;

    BST leveltwo_right = new BST(14);

    first_right_left.right = leveltwo_right;

    System.out.println(findClosestValueInBst(parent, 12));


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
