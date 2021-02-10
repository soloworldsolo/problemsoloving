package com.solo.util;

import static java.util.Objects.requireNonNull;

public class Pair<T, V> {

  private final T firstElemet;

  private final V secondElemnt;


  public Pair(T firstElemet, V secondElemnt) {
    requireNonNull(firstElemet);
    requireNonNull(secondElemnt);
    this.firstElemet = firstElemet;
    this.secondElemnt = secondElemnt;
  }

  public T getFirstElemet() {
    return firstElemet;
  }

  public V getSecondElemnt() {
    return secondElemnt;
  }

  public boolean isFirstElementPresent() {
    return firstElemet != null;
  }

  public boolean isSecondElementPresent() {
    return secondElemnt != null;
  }
}
