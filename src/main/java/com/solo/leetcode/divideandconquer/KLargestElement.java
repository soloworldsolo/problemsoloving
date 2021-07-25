package com.solo.leetcode.divideandconquer;

import java.util.Random;

/**
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * <p>
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 */
public class KLargestElement {

  /**
   * implementation using quick select algorithm
   */
  public int kthLargestElement(int[] input, int i) {
    int end = input.length - 1;
    int randomIndex = getRandomNumber(0, end);
    int random_Value = input[randomIndex];
    while (random_Value != input[i - 1]) {
      reOrder(input, randomIndex);
      if (random_Value != input[i]) {
        randomIndex = getRandomNumber(0, end);
        random_Value = input[randomIndex];
      }
    }
    return random_Value;

  }

  /**
   * method to reorder the arary
   *
   * @param input input
   * @param randomIndex randomIndex
   */
  private void reOrder(int[] input, int randomIndex) {
    int value = input[randomIndex];
    int start = 0;
    int end = input.length - 1;
    while (start < end) {
      if (input[start] < value) {
        start++;
      }

      if (input[end] > value) {
        end--;
      }

      if (input[start] > input[end]) {
        swap(input, start, end);
      }
    }
  }

  private int getRandomNumber(int start, int end) {
    return start + new Random().nextInt(end - start + 1);
  }

  private void swap(int[] iterable, int i, int j) {
    int temp = iterable[j];
    iterable[j] = iterable[i];
    iterable[i] = temp;

  }
}
