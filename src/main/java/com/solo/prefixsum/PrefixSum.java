package com.solo.prefixsum;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

public class PrefixSum {

  public int[] generatePrefixSum(int[] inputarray) {
    var input = requireNonNull(inputarray);
    int[] output = new int[input.length];
    output[0] = input[0];
    for (int i = 1; i < input.length; i++) {
      output[i] = input[i] + output[i - 1];
    }
    return output;
  }

  public static void main(String[] args) {
    int[] expected = {-2, -1, -4, 0, -1, 1, 2, -3, 1};
    PrefixSum prefixSum = new PrefixSum();
    int[] result = prefixSum.generatePrefixSum(expected);
  }
}
