package com.solo.hackerrank;

import java.util.Objects;

public class CloudJumping {

  public int getMaximumHops(int[] input) {
    Objects.requireNonNull(input, "input should not be empty");
    int current_index = 0;
    int result = 0;
    while (current_index < input.length) {
      if (current_index == input.length - 1) {
        return result;
      }
      if ((current_index + 2 < input.length) && input[current_index + 2] == 0) {
        current_index += 2;
      } else {
        if (input[current_index + 1] == 0) {
          current_index += 1;
        }
      }
      result++;
    }
    return result;
  }
}
