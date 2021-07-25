package com.solo.leetcode.divideandconquer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.solo.leetcode.util.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeKSortedListTest {

  private MergeKSortedList mergeKSortedList;

  @BeforeEach
  void setUp() {
    mergeKSortedList = new MergeKSortedList();
  }

  @Test
  void test1() {
    ListNode listNode1 = new ListNode(1);
    listNode1.setNext(new ListNode(4));
    listNode1.getNext().setNext(new ListNode(5));

    ListNode listNode2 = new ListNode(1);
    listNode2.setNext(new ListNode(3));
    listNode2.getNext().setNext(new ListNode(4));

    ListNode listNode3 = new ListNode(2);
    listNode3.setNext(new ListNode(6));

    ListNode[] listNodes = new ListNode[]{
        listNode1, listNode2, listNode3
    };

    ListNode result = mergeKSortedList.mergeKLists(listNodes);
    assertEquals(1, result.getVal());
    assertEquals(1, result.getNext().getVal());
    assertEquals(2, result.getNext().getNext().getVal());
    assertEquals(3, result.getNext().getNext().getNext().getVal());
    assertEquals(4, result.getNext().getNext().getNext().getNext().getVal());
    assertEquals(4, result.getNext().getNext().getNext().getNext().getNext().getVal());

  }
}