package com.solo.datastructure;

public interface Dequeue<E> {


  boolean insertAtPosition(int position, E element);

  boolean removeAtPosition(int position);


}
