package com.solo.multithreading;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Phaser {

  public double[] sumAverageSequential(double[] input) {
    Objects.requireNonNull(input);
    var output = new double[input.length];
    output[0] = input[0];
    output[input.length - 1] = input[input.length - 1];
    for (int i = 1; i < (input.length - 1); i++) {
      var result = (input[i] + input[i + 1]) / 2;
      output[i] = result;
    }
    return output;
  }

  public double[] runWithPhaser(final double[] input) {
    Objects.requireNonNull(input);
    var output = new double[input.length];
    var ph = new java.util.concurrent.Phaser(3);
    Thread[] threads = new Thread[3];
    for (int i = 0; i < threads.length; i++) {
      final int left = i * 3;
      final int right = left + 3;

    }
    return output;
  }

  public double[] runParallelBarrier(final double[] input
  ) throws InterruptedException {
    var ph = new java.util.concurrent.Phaser(3);
    Thread t1 = new Thread(new Task(1, 2, ph, input));
    Thread t2 = new Thread(new Task(3, 5, ph, input));
    Thread t3 = new Thread(new Task(6, 9, ph, input));
    t1.start();
    t2.start();
    t3.start();

    t1.join();
    t2.join();
    t3.join();
    return input;
  }

  public double[] runParallelBarrierExecutor(final double[] input
  ) throws InterruptedException {
    var ph = new java.util.concurrent.Phaser(3);
    ExecutorService executor = Executors.newFixedThreadPool(3);
    Thread t1 = new Thread(new Task(1, 2, ph, input));
    Thread t2 = new Thread(new Task(3, 5, ph, input));
    Thread t3 = new Thread(new Task(6, 9, ph, input));
    executor.execute(t1);
    executor.execute(t2);
    executor.execute(t3);
    executor.shutdown();
    executor.awaitTermination(300, TimeUnit.MILLISECONDS);
    return input;
  }

}
