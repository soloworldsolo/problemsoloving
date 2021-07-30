package com.solo.projectfang.competetiveprogramming;

/**
 * method to find if the given number is prime or not
 */
public class SeieveOfEratosthenes {

  public boolean isPrime(int n) {
    int[] nonPrimeSet = new int[n + 1];
    nonPrimeSet[0] = 0;
    nonPrimeSet[1] = 0;
    nonPrimeSet[2] = 1;

    for (int i = 3; i <= n; i += 2) {
      nonPrimeSet[i] = 1;
    }

    for (int i = 3; i < n; i += 2) {
      if (nonPrimeSet[i] == 1) {
        for (int j = i * i; j <= n; j += i) {
          nonPrimeSet[j] = 0;
        }
      }

    }
    return nonPrimeSet[n] == 1;
  }
}
