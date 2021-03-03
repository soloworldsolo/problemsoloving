package com.solo.leetcode.twopointer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.solo.leetcode.twopointer.SwapNodes.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwapNodesTest {

  private SwapNodes swapNodes;

  @BeforeEach
  void setUp() {
    swapNodes = new SwapNodes();
  }


  @Test
  void test1() {
    ListNode header = new ListNode(1);
    ListNode next = new ListNode(2);
    ListNode nex3 = new ListNode(3);
    ListNode nex4 = new ListNode(4);
    header.next = next;
    next.next = nex3;
    nex3.next = nex4;
    ListNode result = swapNodes.swapPairs(header);
    assertEquals(2, result.val);
    assertEquals(1, result.next.val);
  }

  @Test
  void test2() {
    ListNode header = new ListNode(1);

    ListNode result = swapNodes.swapPairs(header);
    assertEquals(1, result.val);
  }
}