package com.solo.leetcode.greedyalgorithm;

/**
 * Given two strings s and t, check if s is a subsequence of t.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting
 * some (can be none) of the characters without disturbing the relative positions of the remaining
 * characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class IsSubsequence {

    public boolean isSubsequence(String subsequence, String original) {
        int lhs = 0;
        int rhs = 0;
        while (lhs < subsequence.length() && rhs < original.length()) {
            if (subsequence.charAt(lhs) == original.charAt(rhs)) {
                lhs++;
            }
            if (lhs == subsequence.length()) {
                return true;
            }
            rhs++;
        }

        return false;
    }
}
