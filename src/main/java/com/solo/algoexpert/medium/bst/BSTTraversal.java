package com.solo.algoexpert.medium.bst;

import java.util.List;
import java.util.Stack;

public class BSTTraversal {

  public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
    BST currentNode = tree;
    Stack<BST> treeStack = new Stack<>();
    while (currentNode != null) {
      if (currentNode.left != null) {
        treeStack.push(currentNode);
        if (currentNode.left != null) {
          currentNode = currentNode.left;
        } else {
          array.add(currentNode.value);
          currentNode = treeStack.pop();
          if (currentNode.right != null) {
            treeStack.push(currentNode);
            currentNode = currentNode.right;
          }
        }
      } else if (currentNode.right != null) {
        array.add(currentNode.value);
        currentNode = currentNode.right;
      } else {
        array.add(currentNode.value);
        if (!treeStack.isEmpty()) {
          currentNode = getCurrentNode(treeStack, array);
        } else {

          return array;
        }
      }
    }

    return array;
  }

  private static BST getCurrentNode(Stack<BST> treeStack, List<Integer> array) {
    BST cureentNode = null;
    while (!treeStack.isEmpty()) {
      cureentNode = treeStack.pop();
      array.add(cureentNode.value);
      if (cureentNode.right != null) {
        return cureentNode.right;
      }
    }
    return cureentNode;
  }

  public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
    BST currentNode = tree;
    Stack<BST> bstStack = new Stack<>();
    while (currentNode != null) {
      array.add(currentNode.value);
      if (currentNode.right != null) {
        bstStack.push(currentNode.right);
      }
      currentNode = currentNode.left;
      if (currentNode == null && !bstStack.isEmpty()) {
        currentNode = bstStack.pop();
      }
    }
    return array;
  }

  public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
    BST currentNode = tree;
    Stack<BST> bstStack = new Stack<>();
    while (currentNode != null) {
      if (currentNode.left == null && currentNode.right == null) {
        array.add(currentNode.value);
        currentNode = null;
      } else if (currentNode.left != null && currentNode.right != null) {
        bstStack.push(currentNode.right);
        bstStack.push(currentNode);
        currentNode = currentNode.left;
      } else if (currentNode.right != null) {
        bstStack.push(currentNode);
        currentNode = currentNode.right;
      } else if (currentNode.left != null) {
        bstStack.push(currentNode);
        currentNode = currentNode.left;
      }

      if (currentNode == null && !bstStack.isEmpty()) {
        currentNode = getCurrentNodePostOrder(bstStack, array);
      }
    }
    return array;
  }

  private static BST getCurrentNodePostOrder(Stack<BST> bstStack, List<Integer> array) {
    BST currentNode = bstStack.pop();
    while (currentNode != null) {
      if (currentNode.right == null) {
        array.add(currentNode.value);
        currentNode = bstStack.pop();
      } else if (currentNode.right != null) {
        if (isRootNode(currentNode, bstStack)) {
          BST nextNode = bstStack.pop();
          bstStack.push(currentNode);
          return nextNode;
        } else {
          array.add(currentNode.value);
          currentNode = bstStack.isEmpty() ? null : bstStack.pop();
        }
      }
    }
    return currentNode;
  }

  private static boolean isRootNode(BST currentNode, Stack<BST> bstStack) {
    if (bstStack.isEmpty()) {
      return false;
    }
    return currentNode.right == bstStack.peek();
  }


  private static BST getCurrentNode(Stack<BST> bstStack) {
    return null;
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
