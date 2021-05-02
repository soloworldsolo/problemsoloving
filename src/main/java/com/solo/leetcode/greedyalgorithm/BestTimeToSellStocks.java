package com.solo.leetcode.greedyalgorithm;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e.,
 * buy one and sell one share of the stock multiple times).
 * <p>
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock
 * before you buy again).
 */
public class BestTimeToSellStocks {

    public int sellStock(int[] prices) {
        int index = 0, result = 0, currentStockValue = 0;

        while (index < prices.length - 1) {

            while (index < prices.length - 1 && prices[index + 1] < prices[index]) {
                index += 1;
            }
            currentStockValue = prices[index];
            while (index < prices.length - 1 && prices[index] < prices[index + 1]) {
                index += 1;
            }
            result += prices[index++] - currentStockValue;
        }

        return result;
    }
}
