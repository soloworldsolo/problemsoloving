package com.solo.prefixsum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {
  @Mock
  MaxSubArray maxSubArray;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks (this);
    }
    @Test
    public void baseCase() {
        int inputArray[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxsum = maxSubArray.computeMaxSum(inputArray);
        Assertions.assertEquals (maxsum,6);

    }
}