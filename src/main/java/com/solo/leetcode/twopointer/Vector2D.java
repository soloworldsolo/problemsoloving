package com.solo.leetcode.twopointer;

/**
 * Design and implement an iterator to flatten a 2d vector. It should support the following
 * operations: next and hasNext.
 */
public class Vector2D {

  int[][] v;

  int arrayPointer = 0;
  int indexPointer = 0;

  public Vector2D(int[][] v) {
    this.v = v;
  }

  public int next() {
    precheck();
    return v[arrayPointer][indexPointer++];
  }

  public boolean hasNext() {
    precheck();
    return arrayPointer < v.length;
  }


  private void precheck() {
    while (arrayPointer < v.length && indexPointer >= v[arrayPointer].length) {
      arrayPointer++;
      indexPointer = 0;
    }

  }

}
