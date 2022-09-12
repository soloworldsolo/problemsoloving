package com.solo.projectfang.competetiveprogramming;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 */
public class MultiplicativeInverse {

    public int multiplicativeInverseModule(int a, int b) {
        AtomicInteger x = new AtomicInteger();
        AtomicInteger y = new AtomicInteger();
        int gcd = gcd(a, b, x, y);
        if (gcd == 1) {
            return (x.intValue() % b + b) % b;
        }
        return -1;
    }

     int gcd(int a, int b, AtomicInteger x, AtomicInteger y) {
        if (b == 0) {
            x.set(1);
            y.set(0);
            return a;
        }
        int gcd = gcd(b, a % b, x, y);
        int temp = y.intValue();
        y.set(x.intValue() - (a / b) * y.intValue());
        x.set(temp);
        return gcd;
    }
}
