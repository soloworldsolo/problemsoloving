package com.solo.leetcode.concurrency;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

import static org.junit.jupiter.api.Assertions.*;

class PrintFooBarTest {

    PrintFooBar printFooBar;


    @BeforeEach
    void setUp() {
    }

    @Test
    void test1() {
        printFooBar = new PrintFooBar(5, new AtomicBoolean(false));
    }
}