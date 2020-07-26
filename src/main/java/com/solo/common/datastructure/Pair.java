package com.solo.common.datastructure;

public class Pair<T, V> {

  private T elemnetOne;

  private V elementTwo;

  public Pair(T element1, V elementTwo) {
    this.elemnetOne = element1;
    this.elementTwo = elementTwo;
  }

  public T getElemnetOne() {
    return elemnetOne;
  }

  public V getElementTwo() {
    return elementTwo;
  }

  public boolean isElementOnePresent() {
    return (elemnetOne != null);
  }

  public boolean isElementtwoPresent() {
    return (elementTwo != null);
  }
}
