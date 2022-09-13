package com.solo.leetcode.concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

public class PrintZeroEvenOdd {
    private int n;
    private Lock lock;
    private Condition zero, odd, even;
    private volatile int currState;

    public PrintZeroEvenOdd(int n) {
        this.n = n;
        this.lock = new ReentrantLock();
        this.zero = lock.newCondition();
        this.odd = lock.newCondition();
        this.even = lock.newCondition();

        this.currState = 0;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            lock.lock();
            try {
                if (currState != 0)
                    zero.await();

                printNumber.accept(0);
                if (i % 2 == 0) {
                    currState = 2;
                    even.signal();
                } else {
                    currState = 1;
                    odd.signal();
                }
            } finally {
                lock.unlock();
            }

        } // for
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            lock.lock();
            try {
                if (currState != 2)
                    even.await();

                printNumber.accept(i);
                currState = 0;
                zero.signal();
            } finally {
                lock.unlock();
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            lock.lock();
            try {
                if (currState != 1)
                    odd.await();

                printNumber.accept(i);
                currState = 0;
                zero.signal();
            } finally {
                lock.unlock();
            }
        }
    }
}
