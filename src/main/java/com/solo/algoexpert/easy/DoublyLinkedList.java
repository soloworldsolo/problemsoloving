package com.solo.algoexpert.easy;

import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class DoublyLinkedList {

  public Node head;
  public Node tail;

  public void setHead(Node node) {
    if (head == null) {
      this.head = node;
      this.tail = node;
    } else {
      head.prev = node;
      head = node;
    }

  }

  public void setTail(Node node) {
    if (tail == null) {
      this.tail = node;
      this.head = node;

    } else {
      tail.next = node;
      tail = node;



    }
  }

  public void insertBefore(Node node, Node nodeToInsert) {
    Objects.requireNonNull(node);
    Objects.requireNonNull(nodeToInsert);
    Node previousNode = node.prev;
    node.prev = nodeToInsert;
    nodeToInsert.prev = previousNode;

  }

  public void insertAfter(Node node, Node nodeToInsert) {
    Objects.requireNonNull(node);
    Objects.requireNonNull(nodeToInsert);
    if(node == tail) {
      tail = nodeToInsert;
    }
    Node nextNode = node.next;
    node.next = nodeToInsert;
    nodeToInsert.prev = node;
    nodeToInsert.next = nextNode;
  }

  public void insertAtPosition(int position, Node nodeToInsert) {
    int index = 0;
    Node currentNode = head;
    while (position < index && currentNode != null) {
      currentNode = currentNode.next;
      index++;
    }

    if (currentNode != null) {
      Node nextNode = currentNode.next;
      nodeToInsert.prev = currentNode;
      nodeToInsert.next = nextNode;
    }
  }

  public void removeNodesWithValue(int value) {
    Node node = fetchNodeByValue(value);
    if (node != null) {
      Node previousNode = node.prev;
      Node nextNode = node.next;
      previousNode.next = nextNode;
      nextNode.prev = node.prev;
    }
  }

  private Node fetchNodeByValue(int value) {
    Node curentNode = head;
    while (curentNode != null) {
      if (curentNode.value == value) {
        return curentNode;
      } else {
        curentNode = curentNode.next;
      }
    }
    return curentNode;
  }

  public void remove(Node node) {
    Objects.requireNonNull(node, "node cannot be empty");
    Node previousNode = node.prev;
    Node nextNode = node.next;
    if (previousNode != null) {
      previousNode.next = nextNode;

    } else {
      nextNode = head;
    }
    if (nextNode != null) {
      nextNode.prev = previousNode;
    } else {
      tail = nextNode.prev;
    }
  }

  public boolean containsNodeWithValue(int value) {
    return fetchNodeByValue(value) != null;
  }


  static class Node {

    public int value;
    public Node prev;
    public Node next;

    public Node(int value) {
      this.value = value;
    }
  }



}
class Test111 {
  public static void main(String[] args) {
    DoublyLinkedList.Node head = new DoublyLinkedList.Node(1);
    DoublyLinkedList.Node first = new DoublyLinkedList.Node(2);

    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    doublyLinkedList.setHead(head);
    doublyLinkedList.insertAfter(head,first);
    System.out.println(doublyLinkedList.head != null);
    System.out.println(doublyLinkedList.tail!=null);
  }

}


