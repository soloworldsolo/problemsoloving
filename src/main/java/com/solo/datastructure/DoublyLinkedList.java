package com.solo.datastructure;


import static java.util.Objects.requireNonNull;

public class DoublyLinkedList<E> implements Queue<E>, Dequeue<E> {

  private Node<E> head;
  private Node<E> tail;

  @Override
  public void insertFront(E element) {
    requireNonNull(element, "null element cannot be inserted");
    Node<E> temp = head;
    head = new Node<>(element);
    head.next = temp;
  }

  @Override
  public void insertRear(E element) {
    requireNonNull(element, "tries to insert null element");
    Node<E> temp = tail;
    Node<E> node = new Node<>(element);
    if (head == null) {
      insertFront(element);
      return;
    }
    if (tail == null) {
      head.next = node;
      node.previous = head;
      tail = node;
      return;
    }
    tail = node;
    tail.previous = temp;
    temp.next = tail;

  }

  @Override
  public void deleteFront() {
    head = head.next;
    if (head == null) {
      tail = null;
    }
  }

  @Override
  public void deleteRear() {
    tail = tail.previous;
    if (tail == head) {
      head = null;
    }
  }

  @Override
  public E getFront() {
    Node<E> result = requireNonNull(head, "trying to get element from a empty list");
    head = result.next;
    if (head != null) {
      head.previous = null;
    }
    return result.value;
  }

  @Override
  public E getRear() {
    Node<E> result = requireNonNull(tail, "trying to get a elemt from e empty list");
    tail = tail.previous;
    tail.next = null;
    return result.value;
  }

  @Override
  public boolean isEmpty() {
    return head == null;
  }

  @Override
  public boolean isFull() {
    throw new UnsupportedOperationException("invalid operation has been called");
  }

  private void linkNodes(Node<E> node, Node<E> prev, Node<E> nextNode) {
    if (prev == null) {
      insertFront(node.value);
      return;
    }
    if (nextNode != head && nextNode == tail) {
      insertRear(node.value);
      return;
    }
    Node<E> next = prev.next;
    prev.next = node;
    node.previous = prev;
    node.next = next;
    nextNode.previous = node;
  }

  private Node<E> getNode(E element) {
    Node<E> result = null;
    Node<E> current = head;
    while (current != null && result == null) {
      if (current.value == element) {
        result = current;
      }
      current = current.next;
    }
    return requireNonNull(result, "the searched element was not found");
  }


  private Node<E> getNodeAtPosition(int position) {
    if (position == 0) {
      return new Node<>(getFront());
    }
    Node<E> currentNode = head;
    int currentIndex = 0;
    while (currentIndex < position) {
      currentNode = currentNode.next;
      currentIndex++;
    }
    return requireNonNull(currentNode, "element not found");
  }


  private void unlinkNode(Node<E> currentNode) {
    if (currentNode == head || currentNode == tail) {
      if (currentNode == head) {
        getFront();
      } else {
        tail = tail.previous;
        tail.next = null;
      }
      return;
    }
    Node<E> prev = currentNode.previous;
    Node<E> next = currentNode.next;
    prev.next = next;
    next.previous = prev;
  }

  public void insertBefore(E element, E elementBefore) {
    Node<E> node = getNode(requireNonNull(elementBefore, "element cannot be empty"));
    linkNodes(new Node<>(element), node.previous, node);
  }

  public void insertAfter(E element, E elementAfter) {
    Node<E> node = getNode(requireNonNull(elementAfter, "element cannot be empty"));
    linkNodes(new Node<>(element), node, node.next);
  }

  @Override
  public boolean insertAtPosition(int position, E element) {
    requireNonNull(element, "element cannot be null");
    Node<E> node = getNodeAtPosition(position);
    linkNodes(new Node<>(element), node.previous, node);
    return true;
  }

  @Override
  public boolean removeAtPosition(int position) {
    Node<E> node = getNodeAtPosition(position);
    unlinkNode(node);
    return false;
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


