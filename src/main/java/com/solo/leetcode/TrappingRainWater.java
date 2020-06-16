package com.solo.leetcode;

public class TrappingRainWater {

  /**
   * two pointer approach
   */
  public int trappingRainWater(int[] height) {
    int result = 0;
    int leftPointer = 0;
    int rightPointer = height.length - 1;
    int leftMaximun = 0;
    int rightMaximum = 0;
    while (leftPointer < rightPointer) {
      if (height[leftPointer] < height[rightPointer]) {
        if (height[leftPointer] >= leftMaximun) {
          leftMaximun = height[leftPointer];
        } else {
          result += leftMaximun - height[leftPointer];
        }
        leftPointer++;
      } else {
        if (height[rightPointer] >= rightMaximum) {
          rightMaximum = height[rightPointer];
        } else {
          result += rightMaximum - height[rightPointer];
        }
        rightPointer--;
      }


    }

    return result;
  }


}
