package com.solo.leetcode;

public class ReverseLinkedList {

  public ListNode reverseBetween(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode currentNode = head;
    ListNode previousNode = null;
    while (currentNode.next != null) {
      ListNode tempPreviousNode = currentNode.next;
      ListNode tempNextNode = tempPreviousNode.next;
      tempPreviousNode.next = null;
      currentNode.next = null;
      if (previousNode == null) {
        previousNode = tempPreviousNode;
        previousNode.next = currentNode;
      } else {
        tempPreviousNode.next = previousNode;
        previousNode = tempPreviousNode;

      }
      currentNode.next = tempNextNode;

    }
    return previousNode == null ? head : previousNode;
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
