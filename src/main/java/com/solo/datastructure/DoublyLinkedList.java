package com.solo.datastructure;


import static java.util.Objects.requireNonNull;

public class DoublyLinkedList<E> implements Queue<E>, Dequeue<E> {

  private Node<E> head;
  private Node<E> tail;

  @Override
  public void insertFront(E element) {
    if (head == null) {
      head = tail = new Node<>(element);
    }

    Node<E> elementToInsert = new Node<>(element);
    head.previous = elementToInsert;
    if (head == tail) {
      head = tail = elementToInsert;
    } else {
      head = elementToInsert;
    }

  }

  @Override
  public void insertRear(E element) {
    requireNonNull(element, "element should not be empty");
    if (head == null) {
      head = tail = new Node<>(element);
    } else {
      final Node<E> nextElement = new Node<>(element);
      tail.next = nextElement;
      nextElement.previous = tail;
      tail = nextElement;
    }


  }

  @Override
  public void deleteFront() {
    if (head == null) {
      throw new NullPointerException();
    }
    final Node<E> nextNode = head.next;
    if (nextNode == null) {
      head = tail = null;
    } else {
      nextNode.previous = null;
      head = nextNode;
    }
  }

  @Override
  public void deleteRear() {
    if (tail == null) {
      throw new NullPointerException();
    }
    final Node<E> previousNode = tail.previous;
    if (previousNode == null) {
      head = tail = null;
    } else {
      previousNode.next = null;
      tail = previousNode;
    }

  }

  @Override
  public E getFront() {
    if (head == null) {
      throw new NullPointerException();
    }
    return head.value;
  }

  @Override
  public E getRear() {
    if (tail == null) {
      throw new NullPointerException();
    }
    return tail.value;
  }

  @Override
  public boolean isEmpty() {
    return head == null;
  }

  @Override
  public boolean isFull() {
    throw new UnsupportedOperationException("invalid operation has been called");
  }

  @Override
  public void insertBefore(E element, E elementToInsert) {
    requireNonNull(element);
    requireNonNull(elementToInsert);

    Node<E> currentNode = head;

    while (currentNode != null) {
      if (currentNode.value == element) {
        final Node<E> previousElement = currentNode.previous;
        final Node<E> nodeToInsert = new Node<>(elementToInsert);
        if (currentNode == head) {
          head = nodeToInsert;
        }
        if (previousElement != null) {
          previousElement.next = nodeToInsert;
        }
        linkNodes(currentNode, nodeToInsert, previousElement);
        return;
      } else {
        currentNode = currentNode.next;
      }
    }

  }

  @Override
  public void insertAfter(E element, E elementtToBeInserted) {
    requireNonNull(element);
    requireNonNull(elementtToBeInserted);
    Node<E> currentNode = getNode(element);
    if (currentNode != null) {
      if (currentNode == tail) {

        tail = currentNode;
      }
      final Node<E> nodeToBeInserted = new Node<>(elementtToBeInserted);
      final Node<E> nextNode = currentNode.next;
      linkNodes(currentNode, nodeToBeInserted, nextNode);
    }
  }

  private void linkNodes(Node<E> currentNode, Node<E> nodeToBeInserted, Node<E> nextNode) {
    currentNode.next = nodeToBeInserted;
    nodeToBeInserted.previous = currentNode;
    if (nextNode != null) {
      nextNode.previous = nodeToBeInserted;
      nodeToBeInserted.next = nextNode;
    }
  }

  private Node<E> getNode(E element) {
    Node<E> currentNode = head;
    while (currentNode != null) {
      if (currentNode.value == element) {
        break;
      }
      currentNode = currentNode.next;
    }
    return currentNode;
  }

  @Override
  public boolean insertAtPosition(int position, E element) {
    if (position < 0) {
      throw new IllegalArgumentException();
    }
    final Node<E> node = new Node<>(element);
    if (position == 0) {
      linkNodes(head, node, null);
      return true;
    }
    Node<E> previousElement = null;
    Node<E> currentElement = getNodeAtPosition(position, 0);
    if (currentElement != null) {
      previousElement = currentElement.previous;
      currentElement.previous = node;
    }
    node.next = currentElement;
    node.previous = previousElement;
    if (previousElement != null) {
      previousElement.next = node;
    }

    return false;
  }

  private Node<E> getNodeAtPosition(int position, int currentPosition) {
    Node<E> currentElement = head;
    while (position > currentPosition) {
      currentElement = currentElement.next;
      if (currentElement == null) {
        break;
      }
      currentPosition++;
    }
    return currentElement;
  }

  @Override
  public boolean removeAtPosition(int position) {
    if (position < 0) {
      throw new IllegalArgumentException();
    }

    if (position == 0) {
      head = head.next;
      unlinkNode(head);
    }
    Node<E> node = getNodeAtPosition(position, 0);
    if (node != null) {
      if (node == tail) {
        tail = tail.previous;
      }
      unlinkNode(node);
    }
    return false;
  }

  private void unlinkNode(Node<E> currentNode) {
    if (currentNode.previous != null) {
      currentNode.previous.next = currentNode.next;
    }
    if (currentNode.next != null) {
      currentNode.next.previous = currentNode.previous;
    }
    currentNode.previous = null;
    currentNode.next = null;


  }

  private static class Node<E> {

    E value;
    Node<E> previous;
    Node<E> next;

    public Node(E value) {
      this.value = value;
    }
  }
}


