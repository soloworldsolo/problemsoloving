package com.solo.projectfang.competetiveprogramming;


/**
 * We are given two arrays num[0..k-1] and rem[0..k-1]. In num[0..k-1],
 * every pair is coprime (gcd for every pair is 1).
 * We need to find minimum positive number x such that:
 * <p>
 * Input:  num[] = {5, 7}, rem[] = {1, 3}
 * Output: 31
 * Explanation:
 * 31 is the smallest number such that:
 * (1) When we divide it by 5, we get remainder 1.
 * (2) When we divide it by 7, we get remainder 3.
 * <p>
 * Input:  num[] = {3, 4, 5}, rem[] = {2, 3, 1}
 * Output: 11
 * Explanation:
 * 11 is the smallest number such that:
 * (1) When we divide it by 3, we get remainder 2.
 * (2) When we divide it by 4, we get remainder 3.
 * (3) When we divide it by 5, we get remainder 1.
 */
public class ChineseRemainderTheorm extends MultiplicativeInverse {

    public int chineseRemainderTheorem(int[] numerator, int[] remainder) {
        int prod = 1;
        for (int i = 0; i < numerator.length; i++) {
            prod *= numerator[i];
        }
        int result = 0;

        for (int i = 0; i < numerator.length; i++) {
            int pf = prod / numerator[i];
            result += remainder[i] *
                    multiplicativeInverseModule(pf, numerator[i]) * pf;
        }

        return result % prod;
    }
}
