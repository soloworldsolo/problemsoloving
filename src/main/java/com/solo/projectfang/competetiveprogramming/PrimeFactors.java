package com.solo.projectfang.competetiveprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeFactors {

    public List<Integer> findFactors(int num) {
        List<Integer> primeNumbers = getPrimeNumbers(num);
        if (primeNumbers.isEmpty()) {
            return Collections.emptyList();
        }
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int prime = primeNumbers.get(i);
        while (prime * prime < num) {
            if (num % prime == 0) {
                result.add(prime);
                while (num % prime == 0) {
                    num = num / prime;
                }
            }
            prime = primeNumbers.get(++i);
        }
        if (num > 1) {
            result.add(num);
        }
        return result;
    }

    /**
     * returns the list of prime numbers ,
     * return the number of prime numbers uisng
     * seive of erethesis
     *
     * @param num numbers
     * @return List of prime numbers
     */
    public List<Integer> getPrimeNumbers(int num) {
        int[] numbers = new int[num + 1];
        numbers[0] = 0;
        numbers[1] = 0;
        numbers[2] = 1;

        for (int i = 3; i <= num; i += 2) {
            numbers[i] = 1;
        }

        for (int i = 3; i <= num; i += 2) {
            if (numbers[i] == 1) {
                for (int j = i * i; j <= num; j += i) {
                    numbers[j] = 0;
                }
            }
        }

        return IntStream.range(0, numbers.length).boxed().filter(i -> i > 1)
                .filter(i -> numbers[i] == 1)
                .collect(Collectors.toList());
    }
}
