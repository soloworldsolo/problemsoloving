package com.solo.datastructure.heap;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class FibonacciImpl<E> implements FibonacciHeap<E> {

  private final Comparator<? super E> comparator;
  private Node<E> min;

  public FibonacciImpl(Comparator<? super E> comparator) {
    this.comparator = comparator;
  }

  public FibonacciImpl() {
    comparator = null;
  }

  public E getMin() {
    return min.value;
  }

  public Node<E> getMinNode() {
    return min;
  }

  @Override
  public E extractMin() {
    return null;
  }

  @Override
  public void insertion(E value) {
    Objects.requireNonNull(value, "value shouldnot be null");
    Node<E> node = new Node<>(value);
    if (min == null) {
      min = node;
    } else {
      insertNextToMin(value);
    }
  }

  private void insertNextToMin(E value) {
    Node<E> temp = min.next;
    Node<E> current = new Node<>(value);
    min.next = current;
    current.prev = min;
    current.next = temp;
    if (temp != null) {
      temp.prev = current;
    }
    checkForMin(min, current);
  }

  private void checkForMin(Node<E> min, Node<E> current) {
    if (comparator == null) {
      Object value1 = min.value;
      Object value2 = current.value;
      int value = ((Comparable) value1).compareTo(value2);
      if (value > 0) {
        this.min = current;
      }
    }
  }

  @Override
  public void decreaseKey(E currentValue, E newValue) {
    Node<E> node = findNode(currentValue);
  }

  private Node<E> findNode(E currentValue) {
    Node<E> result = null;
    Node<E> currentNode = min;
    while (currentNode != null) {

    }
    return result;
  }

  @Override
  public void deletion(E value) {

  }


  static class Node<E> {

    Node<E> parent;
    Node<E> prev;
    Node<E> next;
    List<Node<E>> child;

    E value;

    boolean isMarked;

    int level;

    public Node(E value) {
      this.value = value;
    }
  }

}
