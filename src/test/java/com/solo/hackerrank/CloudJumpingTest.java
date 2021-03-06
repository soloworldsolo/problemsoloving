package com.solo.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CloudJumpingTest {

  CloudJumping cloudJumping;

  @BeforeEach
  void setUp() {
    cloudJumping = new CloudJumping();
  }

  @Test
  void Basecase() {
    int[] input = {0, 1, 0, 0, 0, 1, 0};
    int result = cloudJumping.getMaximumHops(input);
    assertEquals(3, result);
  }

  @Test
  void Testcase1() {
    int[] input = {0, 0, 1, 0, 0, 1, 0,
    };
    int result = cloudJumping.getMaximumHops(input);
    assertEquals(4, result);

  }


  @Test
  void Testcase2() {
    int[] input = {0, 0, 0, 0, 1, 0
    };

    int result = cloudJumping.getMaximumHops(input);
    assertEquals(3, result);
  }
}