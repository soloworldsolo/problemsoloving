package com.solo.mit;

import static java.util.Objects.requireNonNull;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class YouWillComply {

  public List<Boolean> youWillComply(Boolean[] input) {
    requireNonNull(input, "input cannot be empty");
    if (input.length == 1) {
      return List.of(input[0]);
    }
    for (int i = 1; i < input.length; i++) {
      if (input[i - 1] != input[i]) {
        input[i] = input[i - 1];
      }
    }
    return Arrays.stream(input).collect(Collectors.toList());
  }
}
