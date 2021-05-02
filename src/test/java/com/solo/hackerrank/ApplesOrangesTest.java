package com.solo.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ApplesOrangesTest {

    ApplesOranges applesOranges;

    @BeforeEach
    void setUp() {
        applesOranges = new ApplesOranges();
    }

    @Test
    void test1() {
        var result = new int[]{1, 1};
        Assertions.assertArrayEquals(result, applesOranges.countApplesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6}));
    }
}