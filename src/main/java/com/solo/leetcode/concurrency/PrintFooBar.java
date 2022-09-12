package com.solo.leetcode.concurrency;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 */
public class PrintFooBar {
    private int n;

    private AtomicBoolean lock ;

    public PrintFooBar(int n) {
        this.n = n;
    } public PrintFooBar(int n, AtomicBoolean lock) {
        this.n = n;
        this.lock = lock;
    }

    public void foo(Runnable printFoo) throws InterruptedException {


        synchronized (this) {
            for (int i = 0; i < n; i++) {
                while (lock.get()) {
                    wait();
                }
                printFoo.run();
                lock.set(true);
                notifyAll();

            }

        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        synchronized (this) {
            for (int i = 0; i < n; i++) {

                while (!lock.get()) {
                    wait();
                }
                printBar.run();
                lock.set(false);

                notifyAll();
            }
        }
    }
}
