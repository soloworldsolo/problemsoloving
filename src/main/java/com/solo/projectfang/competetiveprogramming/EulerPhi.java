package com.solo.projectfang.competetiveprogramming;

import java.util.List;

/**
 * Euler’s Phi function (also known as totient function, denoted by
 * ϕ
 * ϕ) is a function on natural numbers that gives the count of positive integers co-prime with the corresponding natural number, i.e., the numbers whose GCD (Greatest Common Divisor) with N is 1. So we can say the following:
 * <p>
 * ϕ
 * ϕ(1) = 1 because gcd(1, 1) is 1.
 * <p>
 * ϕ
 * ϕ(2) = 1 because gcd(1, 2) is 1, but gcd(2, 2) is 2.
 * <p>
 * ϕ
 * ϕ(3) = 2 because gcd(1, 3) is 1 and gcd(2, 3) is 1.
 * <p>
 * ϕ
 * ϕ(4) = 2 because gcd(1, 4) is 1 and gcd(3, 4) is 1.
 * <p>
 * ϕ
 * ϕ(5) = 4 because gcd(1, 5) is 1, gcd(2, 5) is 1, gcd(3, 5) is 1 and gcd(4, 5) is 1.
 * <p>
 * solution :
 * result = n*(1-1/p)
 * where p are the prime factors
 */
public class EulerPhi {
    public int findToitent(int i) {

        List<Integer> primeafctors = new PrimeFactors().findfactors(i);
        float result = i;
        if (!primeafctors.isEmpty()) {
            for (Integer primes : primeafctors) {
                result *= (1.0 * (1.0 / (float)primes));
            }
        }
        if(result >1) {
            result *= (1.0 - (1.0 / (float)i));

        }
        return (int) result;
    }
}
