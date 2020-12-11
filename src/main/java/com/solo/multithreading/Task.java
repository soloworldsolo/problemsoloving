package com.solo.multithreading;

import java.util.concurrent.Phaser;

public class Task implements Runnable {

  private final int starting_index;
  private final int end_index;
  private final java.util.concurrent.Phaser phaser;
  private double[] input;

  public Task(int starting_index, int end_index, Phaser phaser, double[] input) {
    this.starting_index = starting_index;
    this.end_index = end_index;
    this.phaser = phaser;
    this.input = input;
  }

  @Override
  public void run() {
    System.out.println(
        "Executing In Thread" + Thread.currentThread().getName() + "Number of waiting parties"
            + phaser.getArrivedParties());
    int currentIndex = starting_index;
    double[] tempArray = new double[input.length];
    while (currentIndex > 0 && currentIndex <= end_index && input.length - 1 > currentIndex) {
      double calculatedValue = (input[currentIndex] + input[currentIndex + 1]) / 2;
      tempArray[currentIndex++] = calculatedValue;
    }
    System.out.println(
        "Thread waiting in" + Thread.currentThread().getName() + phaser.getUnarrivedParties());
    phaser.arriveAndAwaitAdvance();
    System.out.println("Thread unblocked" + Thread.currentThread().getName());

    swapElements(starting_index, end_index, tempArray, input);


  }

  private void swapElements(int starting_index, int end_index, double[] tempArray, double[] input) {
    System.out.println("Executing Thread" + Thread.currentThread().getName());
    int index = starting_index;
    while (index <= end_index && index < input.length - 1) {
      input[index] = tempArray[index++];
    }
  }
}
