package com.solo.leetcode.bitmanipulation;

import com.solo.leetcode.ReverseLinkedList.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryLinkedListToIntegerTest {

  BinaryLinkedListToInteger binaryLinkedListToInteger;

  @BeforeEach
  void setUp() {
    binaryLinkedListToInteger = new BinaryLinkedListToInteger();
  }

  @Test
  void test1() {
    ListNode listNodehed = new ListNode(1);
    listNodehed.setNext(new ListNode(0));
    listNodehed.getNext().setNext(new ListNode(1));

    Assertions.assertEquals(5, binaryLinkedListToInteger.binaryLinkedListToInteger(listNodehed));

  }
}