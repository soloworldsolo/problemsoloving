package com.solo.leetcode;

public class ReverseLinkedList {

  public ListNode reverseBetween(ListNode head) {
    ListNode result = head;
    while (head != null && head.next != null) {
      ListNode resultPrev = result;
      result = head.next;
      head.next = result.next;
      result.next = resultPrev;
    }
    return result;
  }

  public static class ListNode {

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
