package com.solo.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {

  @Test
  void insertFront() {
    DoublyLinkedList<Integer> integerDoublyLinkedList = new DoublyLinkedList<>();
    integerDoublyLinkedList.insertFront(1)
    ;
    integerDoublyLinkedList.insertRear(2);

    Assertions.assertEquals(1, (int) integerDoublyLinkedList.getFront());
    Assertions.assertEquals(2, (int) integerDoublyLinkedList.getRear());
  }


  @Test
  void deleteFront() {
    DoublyLinkedList<Integer> integerDoublyLinkedList = new DoublyLinkedList<>();
    integerDoublyLinkedList.insertFront(1)
    ;
    integerDoublyLinkedList.insertRear(2);
    integerDoublyLinkedList.insertRear(3);
    integerDoublyLinkedList.insertRear(4);
    integerDoublyLinkedList.insertRear(5);
    integerDoublyLinkedList.deleteFront();
    Assertions.assertEquals(2, (int) integerDoublyLinkedList.getFront());
  }

  @Test
  void deleteRear() {
    DoublyLinkedList<Integer> integerDoublyLinkedList = new DoublyLinkedList<>();
    integerDoublyLinkedList.insertFront(1)
    ;
    integerDoublyLinkedList.insertRear(2);
    integerDoublyLinkedList.insertRear(3);
    integerDoublyLinkedList.insertRear(4);
    integerDoublyLinkedList.insertRear(5);
    integerDoublyLinkedList.deleteRear();
    Assertions.assertEquals(4, (int) integerDoublyLinkedList.getRear());
  }


  @Test
  void insertBefore() {
    DoublyLinkedList<Integer> integerDoublyLinkedList = new DoublyLinkedList<>();
    integerDoublyLinkedList.insertFront(1)
    ;
    integerDoublyLinkedList.insertRear(2);
    integerDoublyLinkedList.insertRear(4);
    integerDoublyLinkedList.insertRear(5);
    integerDoublyLinkedList.insertBefore(1, 3);
    Assertions.assertEquals(3, (int) integerDoublyLinkedList.getFront());
  }

  @Test
  void insertAfter() {
    DoublyLinkedList<Integer> integerDoublyLinkedList = new DoublyLinkedList<>();
    integerDoublyLinkedList.insertFront(1)
    ;
    integerDoublyLinkedList.insertRear(2);
    integerDoublyLinkedList.insertRear(4);
    integerDoublyLinkedList.insertRear(5);
    integerDoublyLinkedList.insertAfter(2, 3);
    Assertions.assertEquals(1, (int) integerDoublyLinkedList.getFront());
  }

  @Test
  void insertAtPosition() {
    DoublyLinkedList<Integer> integerDoublyLinkedList = new DoublyLinkedList<>();
    integerDoublyLinkedList.insertFront(1);
    integerDoublyLinkedList.insertRear(2);
    integerDoublyLinkedList.insertRear(4);
    integerDoublyLinkedList.insertRear(5);
    integerDoublyLinkedList.insertAtPosition(2, 3);
    Assertions.assertEquals(1, (int) integerDoublyLinkedList.getFront());
  }

  @Test
  void removeAtPosition() {
    DoublyLinkedList<Integer> integerDoublyLinkedList = new DoublyLinkedList<>();
    integerDoublyLinkedList.insertFront(1);
    integerDoublyLinkedList.insertRear(2);
    integerDoublyLinkedList.insertRear(3);
    integerDoublyLinkedList.insertRear(3);
    integerDoublyLinkedList.insertRear(4);
    integerDoublyLinkedList.insertRear(5);
    integerDoublyLinkedList.removeAtPosition(2);
    Assertions.assertEquals(1, (int) integerDoublyLinkedList.getFront());
  }
}