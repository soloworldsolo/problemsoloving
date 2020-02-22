package com.solo.prefixsum;

import java.util.Objects;

import static java.util.Objects.*;

public class MaxSubArray {

  public int computeMaxSum(int[] inputArray) {
    var input = requireNonNull(inputArray);
    int result = Integer.MIN_VALUE;
    int currentvalue = inputArray[0];
    for (int i = 1; i < inputArray.length; i++) {
      currentvalue = Math.max(inputArray[i], currentvalue + inputArray[i]);
      result = Math.max(result, currentvalue);

    }
    return result;
  }


}
