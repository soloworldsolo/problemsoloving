package com.solo.projectfang.competetiveprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EulerPhiTest {


    private EulerPhi eulerPhi;

    @BeforeEach
    void setUp() {
        eulerPhi = new EulerPhi();
    }

    @Test
    void testq() {

       assertEquals(4,eulerPhi.findToitent(5));
    }
}