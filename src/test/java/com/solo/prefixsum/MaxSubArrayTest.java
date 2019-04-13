package com.solo.prefixsum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {

  MaxSubArray maxSubArray;
    @BeforeEach
    void setUp() {
        maxSubArray = new MaxSubArray ();
    }

    @Test
    public void baseCase() {
        int inputArray[] = {2,-1,2,3,4,-5};
        int maxsum = maxSubArray.computeMaxSum(inputArray);
        assertEquals (maxsum,10);

    }
    @Test
    public void baseCase1() {
        int inputArray[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxsum = maxSubArray.computeMaxSum(inputArray);
        assertEquals (maxsum,6);

    }

    @Test
    void anotherCase() {
        int inputarray[] = {2 ,-3, 4, -1, -2, 1,5,-3};
        int maxSum = maxSubArray.computeMaxSum (inputarray);
        assertEquals (maxSum,7);
    }
}