package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JumpGameTest {

    private JumpGame jumpGame;

    @BeforeEach
    void setUp() {
        jumpGame = new JumpGame();

    }

    @Test
    void test1() {
        assertEquals(2, jumpGame.minJumps(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    void test2() {
        assertEquals(2, jumpGame.minJumps(new int[]{2, 3, 0, 1, 4}));
    }

    @Test
    void test3() {
        assertEquals(1, jumpGame.minJumps(new int[]{2, 3, 1}));
    }

    @Test
    void test4() {
        assertEquals(3, jumpGame.minJumps(new int[]{1, 2, 3, 4, 5}));
    }


}