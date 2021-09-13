package com.solo.projectfang.competetiveprogramming.backtracking;

/**
 * write a program to multiply two numbers
 * without * sign
 */
public class Multiplication {
    public int multiply(int num1, int num2) {
        if (num1 == 0) {
            return 0;
        }

        if (num2 == 1) {
            return num1;
        }
        if (num2 > 0) {
            return num1 + multiply(num1, num2 - 1);
        } else {
            return -multiply(num1, -num2);
        }

    }
}
