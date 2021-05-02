package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToSellStocksTest {
    BestTimeToSellStocks bestTimeToSellStocks;


    @BeforeEach
    void setUp() {
        bestTimeToSellStocks = new BestTimeToSellStocks();
    }

    @Test
    void test1() {
        var sol = 7;
        assertEquals(sol, bestTimeToSellStocks.sellStock(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void test2() {
        var sol = 4;
        assertEquals(sol, bestTimeToSellStocks.sellStock(new int[]{1, 2, 3, 4, 5}));
    }
}