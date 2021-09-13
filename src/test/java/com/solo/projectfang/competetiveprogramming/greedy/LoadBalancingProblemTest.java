package com.solo.projectfang.competetiveprogramming.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoadBalancingProblemTest {
  private  LoadBalancingProblem loadBalancingProblem;

  @BeforeEach
  void setUp() {
    loadBalancingProblem = new LoadBalancingProblem();
  }

  @Test
  void test1() {
    assertEquals(23,loadBalancingProblem.balanceLoad(new int[]{16,17,15,0,20,1,1,2}));
  }
}