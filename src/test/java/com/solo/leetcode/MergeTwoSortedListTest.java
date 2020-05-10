package com.solo.leetcode;

import com.solo.leetcode.MergeTwoSortedList.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeTwoSortedListTest {

  MergeTwoSortedList mergeTwoSortedList;

  @BeforeEach
  void setUp() {
    mergeTwoSortedList = new MergeTwoSortedList();
  }

  @Test
  void happyCase() {
    var listNode1 = new ListNode(1);
    var listNode11 = new ListNode(2);
    listNode1.next = listNode11;
    var listNode12 = new ListNode(4);
    listNode11.next = listNode12;
    var listNode2 = new ListNode(1);
    var listNode21 = new ListNode(3);
    listNode2.next = listNode21;
    var listNode22 = new ListNode(4);
    listNode21.next = listNode22;

    var result = mergeTwoSortedList.mergeTwoSortedList(listNode1, listNode2);

    Assertions.assertEquals(3, result.next.next.next.val);
  }

  @Test
  void negativeCase() {
    var listNode = new ListNode(0);
    var result = mergeTwoSortedList.mergeTwoSortedList(null, listNode);
    Assertions.assertEquals(0, result.val);
  }

  @Test
  void negativeCase1() {
    var listNode = new ListNode(5);
    var listNode21 = new ListNode(1);
    var listNode22 = new ListNode(2);
    listNode21.next = listNode22;
    var listNode23 = new ListNode(4);
    listNode22.next = listNode23;

    var result = mergeTwoSortedList.mergeTwoSortedList(listNode, listNode21);
    Assertions.assertEquals(0, result.val);
  }
}