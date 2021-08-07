package com.solo.projectfang.competetiveprogramming;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * The Extended Euclid’s algorithm is used to find the solution of equations of the form Ax + By = C ,
 * where C is a multiple of divisor of A and B, or in other words C = gcd(A, B).
 */
public class ExtendedEcludein {

    public int gcd(int x, int y, AtomicInteger a, AtomicInteger b) {
        if (y == 0) {
            a.set(1);
            b.set(0);
            return x;
        }
        AtomicInteger a1 = new AtomicInteger(1);
        AtomicInteger b1 = new AtomicInteger(1);
        int res = gcd(y, x % y, a1, b1);
        int temp = b1.get();
        b.set(a1.get() - (x / y) * b1.get());
        a.set(temp);
        return res;
    }

    public int iterativeGCD(int a, int b) {
        int x = 0, y = 1, prevx = 1, prevy = 0;
        while (b != 0) {
            int quotient = a / b;
            int remainder = a % b;
            int tempx = x;
            x = prevx - quotient * x;
            prevx = tempx;

            int tempy = y;
            y = prevy - quotient * y;
            prevy = tempy;

            a = b;
            b = remainder;
        }
        return a;
    }
}
