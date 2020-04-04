package com.solo.hackerrank;

import java.util.Arrays;
import java.util.Objects;

public class NumberOfCandles {
  static int birthdayCakeCandles(int[] ar) {
    Objects.requireNonNull(ar,"input cannot be empty");
    Arrays.sort(ar);
    int i = ar.length -1;
    int highestNumber =ar[i];
    int result =0;
    while(i>=0 ){
     if(ar[i] == highestNumber) {
       result++;
     }
     i--;
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println(NumberOfCandles.birthdayCakeCandles(new int[]{1,1,1,1,1,1,1}));
  }
}
