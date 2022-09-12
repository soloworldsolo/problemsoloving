package com.solo.projectfang.competetiveprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicativeInverseTest {

    private MultiplicativeInverse multiplicativeInverse;

    @BeforeEach
    void setUp() {
        multiplicativeInverse = new MultiplicativeInverse();
    }

    @Test
    void test1() {
        assertEquals(4, multiplicativeInverse.multiplicativeInverseModule(3, 11));
        assertEquals(6, multiplicativeInverse.multiplicativeInverseModule(3, 17));
    }

    @Test
    void testGCD() {
        assertEquals(4, multiplicativeInverse.gcd(8, 12,new AtomicInteger(), new AtomicInteger()));
    }
}