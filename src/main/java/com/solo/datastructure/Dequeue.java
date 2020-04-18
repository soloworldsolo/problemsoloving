package com.solo.datastructure;

public interface Dequeue<E> {

  void insertBefore(E element, E elementTobeinserted);

  void insertAfter(E element, E elemetToBeInserted);

  boolean insertAtPosition(int position, E element);

  boolean removeAtPosition(int position);


}
