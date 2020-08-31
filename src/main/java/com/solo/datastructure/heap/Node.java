package com.solo.datastructure.heap;

public class Node<T> {

  T value;

  Node<T> parent;

  Node<T> child;

  boolean isMarked;

  int level;

}
