package com.solo.datastructure;

import static java.util.Objects.requireNonNull;

public class DoubleEndedQueue<E> implements Queue<E> {

  private Object[] element;
  private int firstPointer = 0;
  private int lastPointer = 0;
  private int MAXIMUM_SIZE;

  public DoubleEndedQueue() {
    this(16);
  }

  public DoubleEndedQueue(int size) {
    if (size < 0) {
      throw new IllegalArgumentException();
    }
    this.element = (E[]) new Object[size];
    MAXIMUM_SIZE = element.length - 1;
  }

  @Override
  public void insertFront(E elemen) {
    requireNonNull(elemen);
    if (isEmpty()) {
      element[0] = elemen;
      incrementFirstPointer();
    } else {
      element[decrementFirstPointer()] = elemen;
    }
  }

  @Override
  public void insertRear(E elemen) {
    requireNonNull(elemen);
    if (isEmpty()) {
      element[0] = elemen;
    } else {
      element[getLastPointer()] = elemen;
    }
    incremnetLastPointer();
  }

  @Override
  public void deleteFront() {
    element[firstPointer] = null;
    incrementFirstPointer();
  }

  @Override
  public void deleteRear() {
    element[decrementLastPointer()] = null;
  }

  @Override
  public E getFront() {
    return (E) element[firstPointer];
  }

  @Override
  public E getRear() {
    int pointer = decrementLastPointer();
    E elem = (E) element[pointer];
    element[pointer] = null;
    return elem;

  }

  @Override
  public boolean isEmpty() {
    return firstPointer == 0 && lastPointer == 0;

  }

  @Override
  public boolean isFull() {
    return firstPointer + lastPointer >= MAXIMUM_SIZE;
  }

  private int incrementFirstPointer() {

    if (++firstPointer > MAXIMUM_SIZE) {
      firstPointer = 0;
    }
    return firstPointer;
  }

  private int decrementLastPointer() {
    if (--lastPointer < 0) {
      lastPointer = MAXIMUM_SIZE;
    }
    return lastPointer;
  }

  private int incremnetLastPointer() {
    if (++lastPointer > MAXIMUM_SIZE) {
      lastPointer = 0;
    }
    return lastPointer;
  }

  private int getLastPointer() {
    return lastPointer;
  }

  private int decrementFirstPointer() {
    if (--firstPointer < 0) {
      firstPointer = MAXIMUM_SIZE;
    }
    return firstPointer;
  }
}
