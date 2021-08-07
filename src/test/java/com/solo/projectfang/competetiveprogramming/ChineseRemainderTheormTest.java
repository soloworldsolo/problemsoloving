package com.solo.projectfang.competetiveprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChineseRemainderTheormTest {

    ChineseRemainderTheorm chineseRemainderTheorm;

    @BeforeEach
    void setUp() {
        chineseRemainderTheorm = new ChineseRemainderTheorm();
    }

    @Test
    void test1() {
       assertEquals(11,chineseRemainderTheorm.chineseRemainderTheorem(new int[]{3,4,5}, new int[]{2,3,1}));
    }
}