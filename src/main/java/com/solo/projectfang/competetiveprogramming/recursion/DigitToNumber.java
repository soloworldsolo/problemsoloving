package com.solo.projectfang.competetiveprogramming.recursion;

import java.util.Objects;

/**
 * Given a number n, convert each digit of that number to its corresponding string.
 * Make sure the order is correct.
 * For example, let us take n = 278.
 * The output should be two seven eight
 */
public class DigitToNumber {
    String[] lookup = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String output = "";

    public String convertToString(int input) {
        Objects.requireNonNull(input, "cannot take null as input");
        if (input == 0) {
            return "";
        }
        convertToString(input / 10);
        output = output + lookup[input % 10]+ " ";
        return output;
    }
}
