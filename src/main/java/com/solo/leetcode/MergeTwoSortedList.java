package com.solo.leetcode;

public class MergeTwoSortedList {

  public ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {
    ListNode resultNode = new ListNode(0);
    ListNode currentNode = resultNode;
    while (l1 != null && l2 != null) {
      if (l1.val > l2.val) {
        currentNode.next = l2;
        l2 = l2.next;

      } else {
        currentNode.next = l1;
        l1 = l1.next;
      }
      currentNode = currentNode.next;
    }

    if (l1 != null) {
      currentNode.next = l1;
    }
    if (l2 != null) {
      currentNode.next = l2;
    }

    return resultNode.next;
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