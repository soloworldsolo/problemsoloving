package com.solo.projectfang.competetiveprogramming;

import java.util.concurrent.atomic.AtomicInteger;

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
}
