package com.solo.leetcode;

public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    int area = 0;

    int firstPointer = 0;
    int secondpointer = height.length - 1;

    while (firstPointer < secondpointer) {

      area = Math.max(getCurrentArea(firstPointer, secondpointer, height), area);
      if (height[firstPointer] > height[secondpointer]) {
        secondpointer--;
      } else {
        firstPointer++;
      }
    }

    return area;
  }

  private int getCurrentArea(int firstPointer, int secondPointer, int[] height) {

    return Math.min(height[firstPointer], height[secondPointer]) * (secondPointer - firstPointer);
  }

}
