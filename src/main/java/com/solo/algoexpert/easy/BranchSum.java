package com.solo.algoexpert.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

/**
 * ​Write a function that takes in a Binary Tree and returns a list of its branch sums (ordered from
 * leftmost branch sum to rightmost branch sum). A branch sum is the sum of all values in a Binary
 * Tree branch. A Binary Tree branch is a path of nodes in a tree that starts at the root node and
 * ends at any leaf node. Each Binary Tree node has a value stored in a property called "value" and
 * two children nodes stored in properties called "left" and "right," respectively. Children nodes
 * can either be Binary Tree nodes themselves or the None (null) value.
 */
public class BranchSum {

   static class BinaryTree {

     int value;
     BinaryTree left;
     BinaryTree right;

     BinaryTree(int value) {
       this.value = value;
       this.left = null;
       this.right = null;
     }
   }


  /**
   *
   * @param root
   * @return List<Integer/>
   */
  public static List<Integer> branchSums(BinaryTree root) {
    Objects.requireNonNull(root, "input should not be empty");
    List<Integer> branchSum = new ArrayList<>();
    BinaryTree currentNode = root;
    int inheritedValue = 0;
    Stack<BinaryTree> childStack = new Stack<>();
    Stack<Integer> inheritedValueStack = new Stack<>();

    while (currentNode != null) {
      inheritedValue = sum(currentNode, inheritedValue);

      if (currentNode.right != null) {
        childStack.push(currentNode.right);
        inheritedValueStack.push(inheritedValue);
        currentNode = currentNode.left;
        if (currentNode == null && !childStack.isEmpty()) {
          currentNode = childStack.pop();
          inheritedValue = inheritedValueStack.pop();
        }

      } else if (currentNode.right == null && currentNode.left != null) {
        currentNode = currentNode.left;
      } else if (currentNode.left == null && childStack.isEmpty()) {
        if (inheritedValue != 0) {
          branchSum.add(inheritedValue);

        }
        currentNode = null;
      } else if (!childStack.empty() && !inheritedValueStack.isEmpty()) {
        branchSum.add(inheritedValue);
        currentNode = childStack.pop();
        inheritedValue = inheritedValueStack.pop();
      }


    }
    return branchSum;
  }

  private static int sum(BinaryTree tree, int value) {
    if (tree != null) {
      return tree.value + value;
    }
    return 0;
  }

}


class TestBinaryTree extends BranchSum.BinaryTree {

  TestBinaryTree(int value) {
    super(value);
  }

  TestBinaryTree insert(List<Integer> values) {
    return insert(values, 0);
  }

  TestBinaryTree insert(List<Integer> values, int i) {
    if (i >= values.size()) {
      return null;
    }

    List<TestBinaryTree> queue = new ArrayList<>();
    queue.add(this);
    while (queue.size() > 0) {
      TestBinaryTree current = queue.get(0);
      queue.remove(0);
      if (current.left == null) {
        current.left = new TestBinaryTree(values.get(i));
        break;
      }
      queue.add((TestBinaryTree) current.left);
      if (current.right == null) {
        current.right = new TestBinaryTree(values.get(i));
        break;
      }
      queue.add((TestBinaryTree) current.right);
    }
    insert(values, i + 1);
    return this;
  }

  public static void main(String[] args) {
    TestBinaryTree tree = new TestBinaryTree(0);
    tree.left = new TestBinaryTree(9);
    tree.right = new TestBinaryTree(1);
    tree.right.left = new TestBinaryTree(15);
    tree.right.right = new TestBinaryTree(10);
    tree.right.right.left = new TestBinaryTree(100);
    tree.right.right.right = new TestBinaryTree(200);
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(9, 16, 111, 211));
    System.out.println(BranchSum.branchSums(tree).equals(expected));
  }
}
