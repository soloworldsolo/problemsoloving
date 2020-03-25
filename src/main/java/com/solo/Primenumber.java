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

  public static void main(String[] args) {
    int number = 25;
    System.out.println(number >>> 2);
  }
}

