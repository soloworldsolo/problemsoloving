package com.solo.datastructure.heap;

import com.solo.trees.bst.Node;

public interface FibonacciHeap<T> {

  T extractMin();

  void insertion(T value);

  void union(Node leftTree, Node rightTree);

  void decreaseKey(T value);

  void deletion(T value);


}
