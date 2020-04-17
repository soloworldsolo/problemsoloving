
package com.solo.datastructure;

public interface Queue<E> {

  void insertFront(E element);

  void insertRear(E element);

  void deleteFront();

  void deleteRear();

  E getFront();

  E getRear();

  boolean isEmpty();

  boolean isFull();

}
