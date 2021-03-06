package com.solo.prefixsum;

import static java.util.Objects.requireNonNull;

public class PrefixSum {

  public static void main(String[] args) {
    int[] expected = {-2, -1, -4, 0, -1, 1, 2, -3, 1};
    PrefixSum prefixSum = new PrefixSum();
    int[] result = prefixSum.generatePrefixSum(expected);
  }

  public int[] generatePrefixSum(int[] inputArray) {
    var input = requireNonNull(inputArray);
    int[] output = new int[input.length];
    output[0] = input[0];
    for (int i = 1; i < input.length; i++) {
      output[i] = input[i] + output[i - 1];
    }
    return output;
  }
}
