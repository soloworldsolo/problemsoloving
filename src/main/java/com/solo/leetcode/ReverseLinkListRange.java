package com.solo.leetcode;

public class ReverseLinkListRange {

  public ListNode reverseBetween(ListNode head, int m, int n) {
    ListNode prev = null;
    ListNode currentNode = head;
    ListNode conNode;
    ListNode tailNode;
    ListNode nextNode;

    while (m > 1) {
      prev = currentNode;
      currentNode = currentNode.next;
      m--;
      n--;
    }
    tailNode = prev;
    conNode = currentNode;

    while (n > 0) {
      nextNode = currentNode.next;
      currentNode.next = prev;
      prev = currentNode;
      currentNode = nextNode;
      m--;
      n--;
    }
    if (tailNode == null) {
      head = prev;
    } else {
      tailNode.next = prev;
    }
    conNode.next = currentNode;

    return head;
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
