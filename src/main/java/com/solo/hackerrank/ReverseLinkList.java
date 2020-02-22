package com.solo.hackerrank;

import com.solo.trees.bst.Node;

public class ReverseLinkList {

  public Node reverse(com.solo.trees.bst.Node headNode) {
    if (headNode == null) {
      throw new NullPointerException("Node is null");
    }
    Node head = null;
    Node currentNode = headNode;
    Node previousNode = null;

    while (head == null) {
      if (currentNode.getLeftnode() == null) {
        head = currentNode;
      }
      if (previousNode != null) {
        head.setLeftnode(previousNode);
      } else {

      }
    }

    return head;
  }

  public static void main(String[] args) {
    ReverseLinkList linkList = new ReverseLinkList();

    Node head = new Node(1);
    Node child1 = new Node(2);
    Node child2 = new Node(3);

    head.setLeftnode(child1);
    child1.setLeftnode(child2);

    Node result = linkList.reverse(head);
  }
}
