package com.solo.trees.bst;

public class Node {

  int value;
  Node leftnode;
  Node rightnode;

  public Node(int value) {
    this.value = value;
  }

  public Node() {
  }

  public Node getLeftnode() {
    return leftnode;
  }

  public void setLeftnode(Node leftnode) {
    this.leftnode = leftnode;
  }

  public Node getRightnode() {
    return rightnode;
  }

  public void setRightnode(Node rightnode) {
    this.rightnode = rightnode;
  }


  public int getValue() {
    return value;
  }
}
