package com.solo.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DoubleEndedQueueTest {


  @Test
  void insertFront() {
    Queue<Integer> doubleEndedQueue = new DoubleEndedQueue<>(5);

    doubleEndedQueue.insertRear(1);
    doubleEndedQueue.insertRear(2);
    doubleEndedQueue.insertRear(3);
    doubleEndedQueue.insertRear(4);
    Assertions.assertEquals(4, (int) doubleEndedQueue.getRear());
    Assertions.assertEquals(3, (int) doubleEndedQueue.getRear());
  }

  @Test
  void insertRear() {
    Queue<Integer> doubleEndedQueue = new DoubleEndedQueue<>(4);
    doubleEndedQueue.insertRear(1);
    doubleEndedQueue.insertRear(2);
    doubleEndedQueue.insertRear(3);
    doubleEndedQueue.insertRear(4);
    doubleEndedQueue.deleteRear();
    Assertions.assertEquals(3, (int) doubleEndedQueue.getRear());
  }

}