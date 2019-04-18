package com.solo.prefixsum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SamedivisorsinRangeTest {
    SamedivisorsinRange range;
    @BeforeEach
    void setUp() {
        range = new SamedivisorsinRange ();
    }

    @Test
    void baseCase() {
        int result = range.findSameDivisorsinrange (3);
        Assertions.assertEquals (1,result);
    }
}