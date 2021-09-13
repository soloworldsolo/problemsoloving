package com.solo.projectfang.competetiveprogramming.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTest {
    private Multiplication multiplication;


    @BeforeEach
    void setUp() {
        multiplication = new Multiplication();
    }

    @Test
    void test1() {
        assertEquals(21, multiplication.multiply(7, 3));
    }

    @Test
    void negativeNumberTest() {
        assertEquals(-21, multiplication.multiply(7, -3));
    }

    @Test
    void bothNumbersNegativeTest() {
        assertEquals(21,multiplication.multiply(-7,-3));
    }
}