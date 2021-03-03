package com.solo.leetcode.twopointer;

public class SwapNodes {

  public ListNode swapPairs(ListNode head) {

    if (head == null || head.next == null) {
      return head;
    }
    ListNode result = head.next;
    ListNode current = head;
    ListNode prev = null;
    while (current != null && current.next != null) {
      ListNode next = current.next;
      if (prev != null) {
        prev.next = next;
      }

      current.next = next.next;
      next.next = current;
      prev = current;
      current = current.next;
    }

    return result;

  }

  static class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
