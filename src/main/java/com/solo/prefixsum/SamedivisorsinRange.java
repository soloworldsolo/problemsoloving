package com.solo.prefixsum;

public class SamedivisorsinRange {

  public int findSameDivisorsinrange(int numbers) {
    int result = 0;
    int previousresult = 1;
    for (int i = 2; i < numbers; i++) {
      int numberOfDivisors = nummberOfdivisors(i);
      if (previousresult == numberOfDivisors) {
        result++;
      }
      previousresult = numberOfDivisors;
    }

    return result;
  }

  private int nummberOfdivisors(int input) {
    if (input < 4) {
      return 1;
    }
    int numofDivisors = 1;
    for (int i = 2; i < input / 2; i++) {
      if (input % 2 == 0) {
        numofDivisors++;
      }
    }

    return numofDivisors;
  }
}
