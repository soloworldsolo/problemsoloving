package com.solo.hackerrank;

import java.util.Arrays;
import java.util.Objects;

public class SumofVeryBigNumbers {

  public  long aVeryBigSum(long[] ar) {
    Objects.requireNonNull(ar, "Invalid Onput input should not be null");

    return Arrays.stream(ar).sum();

  }
}
