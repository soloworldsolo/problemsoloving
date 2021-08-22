package com.solo.projectfang.competetiveprogramming.divideandconquer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintersPartitionProblemTest {
  private  PaintersPartitionProblem paintersPartitionProblem;

  @BeforeEach
  void setUp() {
    paintersPartitionProblem = new PaintersPartitionProblem();
  }

  @Test
  void test1() {
    int[] input = {10,20,30,40};
     assertEquals(60,paintersPartitionProblem.partition(input,input.length,2));
  }
}