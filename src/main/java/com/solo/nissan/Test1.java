package com.solo.nissan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * @author soloworld
 */
public class Test1 {

  static Long minsum_and(long[] arr, int i) {
    Objects.requireNonNull(arr, "input element cannot be empty");
    List<Long> results = new ArrayList<>();
    long firstValue = arr[0];
    long sum = 0;
    for (int j = 0; j < arr.length; j++) {

      for (int k = 0; k <= j; k++) {
        if (k == 1) {
          sum = arr[0] & arr[1];
        } else {
          sum &= arr[k];
        }
      }
      if (sum != 0) {
        results.add(sum);

      }
      sum = 0;
    }

    return results.stream().min(Comparator.naturalOrder()).map(res -> Long.valueOf(res)).orElse(
        -1L);
  }


  public static void main(String[] args) {
    long intList[] = {10L, 1L, 20L, 1L};
    System.out.println(Test1.minsum_and(intList, 4));
  }
}
