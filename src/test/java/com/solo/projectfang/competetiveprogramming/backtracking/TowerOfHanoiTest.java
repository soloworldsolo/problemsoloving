package com.solo.projectfang.competetiveprogramming.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TowerOfHanoiTest {

    @Test
    void test() {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.towerOfHanoi(4,"A","C","B");
    }
}