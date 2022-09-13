package com.solo.leetcode.concurrency;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 */
public class PrintFooBar {
    private int n;
    private AtomicBoolean lock = new AtomicBoolean(false);
    private ReentrantLock objLock;
    private Condition fooCondn, barCondn;


    public PrintFooBar(int n) {
        this.n = n;

    }

    public PrintFooBar(int n, AtomicBoolean lock) {
        this.n = n;
        this.lock = lock;
        this.objLock = new ReentrantLock();
        this.fooCondn = objLock.newCondition();
        this.barCondn = objLock.newCondition();
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            try {
                objLock.lock();
                while (lock.get()) {
                    fooCondn.await();
                }
                printFoo.run();
                lock.set(true);
                barCondn.signal();
            } finally {
                objLock.unlock();
            }
        }

    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            try {
                objLock.lock();
                while (!lock.get()) {
                    barCondn.await();
                }

                printBar.run();
                lock.set(false);
                fooCondn.signal();
            } finally {
                objLock.unlock();
            }
        }
    }
}
