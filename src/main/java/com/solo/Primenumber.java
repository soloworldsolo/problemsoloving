package com.solo;

public class Primenumber {

  public boolean isPrime(int number) {
      if (number < 1) {
          throw new IllegalArgumentException("Enter a positive number");
      }

      if (number < 3) {
          return true;
      }

    return !(number % 2 == 0 || number % 3 == 0);
  }
}
