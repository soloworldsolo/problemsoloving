package com.solo.algoexpert.medium.bst;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class BinarySearchTree {

  static class BST {

    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }

    public BST insert(int value) {
      BST current = this;
      while (current != null) {
        if (value < current.value) {
          if (current.left == null) {
            current.left = new BST(value);
            break;
          } else {
            current = current.left;
          }
        } else if (value >= current.value) {
          if (current.right == null) {
            current.right = new BST(value);
            break;
          } else {
            current = current.right;
          }
        }
      }

      return this;
    }

    public boolean contains(int value) {
      // Write your code here.
      return findNode(value) != null;
    }

    private BST findNode(int value) {
      BST current = this;
      while (current != null) {
        if (current.value == value) {
          return current;
        } else if (value < current.value) {
          current = current.left;
        } else {
          current = current.right;
        }
      }
      return current;
    }

    public BST remove(int value) {
      BST node = this;
      BST parentNode = null;
      while (node != null) {
        if (value == node.value) {
          break;
        }
        parentNode = node;
         if (value < node.value) {
          node = node.left;
        } else if (value > node.value) {
          node = node.right;
        }
      }
      if (node != null) {
        if (node.left == null && node.right == null) {
          if (parentNode.left.value == node.value) {
            parentNode.left = null;
          } else if (parentNode.right.value == node.value) {
            parentNode.right = null;
          }
        } else if (node.left != null && node.right != null) {
          if (node.right.left != null) {
            BST succesor = node.right.left;
            BST parent = node.right;
            while (succesor != null) {
              if (succesor.left == null) {
                break;
              } else {
                parent = succesor;
                succesor = succesor.left;
              }
            }
            if (parent != null) {
              parent.left = succesor.right;
            }
            unLinkSuccessor(node, succesor);
            if (parentNode != null) {
              if (succesor.value > parentNode.value) {
                parentNode.right = succesor;
              } else {
                parentNode.left = succesor;
              }
            }
          } else {
            if (node.left.right != null) {
              BST succesor = node.left.right;
              BST parent = node.left;
              while (succesor != null) {
                if (succesor.right == null) {
                  break;
                } else {
                  parent = succesor;
                  succesor = succesor.right;
                }
                if (parent != null) {
                  parent.right = null;
                }
                unLinkSuccessor(node, succesor);
              }
            }

          }
        } else {
          BST childNode = null;
          if (node.left != null) {
            childNode = node.left;
            node.left = null;
          } else {
            childNode = node.right;
            node.right = null;
          }
          if (parentNode == null) {
            this.value = childNode.value;
            this.left =childNode.left;
            this.right = childNode.right;
          } else {
              if(childNode.value < parentNode.value) {
                    parentNode.left = childNode;
              }else {
                parentNode.right = childNode;
              }
          }
        }

      }
      return this;
    }

    private void unLinkSuccessor(BST node, BST succesor) {
      succesor.left = node.left;
      succesor.right = node.right;
      node.left = null;
      node.right = null;
      node = null;
    }
  }
}

class TestBST {

  static BinarySearchTree.BST test1;
  static BinarySearchTree.BST test2;
  static BinarySearchTree.BST test3;
  static BinarySearchTree.BST test4;

  static {
    test2 = new BinarySearchTree.BST(10).insert(5).
    insert(15).insert(22).insert(17).insert(34).insert(7).insert(2).
        insert(5).insert(1).insert(35).insert(27).insert(16).insert(30);
    test2.remove(22);
    test2.remove(17)
    ;
  }

  private static void inOrderTraverse(BinarySearchTree.BST tree, List<Integer> array) {
    if (tree.left != null) {
      inOrderTraverse(tree.left, array);
    }
    array.add(tree.value);
    if (tree.right != null) {
      inOrderTraverse(tree.right, array);
    }
  }

  public static void main(String[] args) {
    List<Integer> output = new ArrayList<>();
    TestBST.inOrderTraverse(test2, output);
  }
}