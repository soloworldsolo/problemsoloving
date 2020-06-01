package com.solo.leetcode;

import com.solo.leetcode.ReverseLinkListRange.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseLinkListRangeTest {

  ReverseLinkListRange linkListRange;

  @BeforeEach
  void setUp() {
    linkListRange = new ReverseLinkListRange();
  }

  @Test
  void sanity() {
    ListNode headNode = new ListNode(1);
    headNode.next = new ListNode(2);
    headNode.next.next = new ListNode(3);
    headNode.next.next.next = new ListNode(4);
    headNode.next.next.next.next = new ListNode(5);

    ListNode result = linkListRange.reverseBetween(headNode, 2, 4);
    Assertions.assertEquals(1, result.val);
    Assertions.assertEquals(4, result.next.val);
    Assertions.assertEquals(3, result.next.next.val);
    Assertions.assertEquals(2, result.next.next.next.val);
    Assertions.assertEquals(1, result.next.next.next.next.val);

    ListNode next = result.next;


  }
}