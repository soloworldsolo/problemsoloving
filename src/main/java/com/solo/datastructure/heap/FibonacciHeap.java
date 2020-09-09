package com.solo.datastructure.heap;

public interface FibonacciHeap<E> {

  E extractMin();

  void insertion(E value);


  void decreaseKey(E previousvalue, E newValue);

  void deletion(E value);


}
