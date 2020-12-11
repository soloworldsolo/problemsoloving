package com.solo.multithreading;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PhaserTest {

  Phaser phaser;

  @BeforeEach
  void setUp() {
    phaser = new Phaser();
  }


  @Test
  void testAraryAveargeSequential() {
    var input = new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
    var output = new double[]{1, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5, 10};
    assertArrayEquals(output, phaser.sumAverageSequential(input));
  }

  @Test
  void testAraryAveargeParralel() throws InterruptedException {
    var input = new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
    var output = new double[]{1, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5, 10};

    assertArrayEquals(output, phaser.runParallelBarrier(input));
  }

  @Test
  void testAraryExecutorservice() throws InterruptedException {
    var input = new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
    var output = new double[]{1, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5, 10};

    assertArrayEquals(output, phaser.runParallelBarrierExecutor(input));
  }
}