package com.solo.algoexpert.medium;

public class LongestPeak {

  public int longestPeak(int[] array) {
    int startIndex = 1;
    int peakLength = 0;
    int maximumPeak = Integer.MIN_VALUE;

    while (startIndex < array.length - 1) {
      if (array[startIndex] > array[startIndex - 1] && array[startIndex] > array[startIndex + 1]) {
        peakLength = getLeftSequence(array, startIndex - 1) + 3;
        if (peakLength > maximumPeak) {
          maximumPeak = peakLength;
        }
      } else if (peakLength > 0 && array[startIndex] > array[startIndex + 1]) {
        peakLength++;
        if (peakLength > maximumPeak) {
          maximumPeak = peakLength;
        }
      } else {
        peakLength = 0;
      }
      startIndex++;
    }
    return maximumPeak;
  }

  private int getLeftSequence(int[] array, int index) {
    int result = 0;
    while (index > 0) {
      if (array[index] > array[index - 1]) {
        result++;
        index--;
      } else {
        return result;
      }
    }
    return result;
  }
}
