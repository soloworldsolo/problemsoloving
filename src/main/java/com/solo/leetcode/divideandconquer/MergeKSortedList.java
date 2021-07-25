package com.solo.leetcode.divideandconquer;

import com.solo.leetcode.util.ListNode;

/**
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * <p>
 * Merge all the linked-lists into one sorted linked-list and return it.
 */
public class MergeKSortedList {

  public ListNode mergeKLists(ListNode[] listNodes) {
    ListNode result = null;
    int currentindex = 0;

    while (currentindex < listNodes.length) {
      ListNode current = result;
      ListNode localResult = new ListNode();
      ListNode localResult1 = localResult;
      ListNode nextNode = listNodes[currentindex];
      while (current != null || nextNode != null) {
        while (current != null && nextNode != null) {
          if (current.getVal() > nextNode.getVal()) {
            localResult1.setNext(new ListNode(nextNode.getVal()));
            nextNode = nextNode.getNext();
          } else {
            localResult1.setNext(new ListNode(current.getVal()));
            current = current.getNext();
          }
          if (localResult1.getNext() != null) {
            localResult1 = localResult1.getNext();
          }
        }

        if (current == null && nextNode != null) {
          localResult1.setNext(new ListNode(nextNode.getVal()));
          nextNode = nextNode.getNext();
        }
        if (nextNode == null && current != null) {
          localResult1.setNext(new ListNode(current.getVal()));
          current = current.getNext();
        }
        if (localResult1.getNext() != null) {
          localResult1 = localResult1.getNext();

        }


      }
      currentindex++;
      result = localResult.getNext();
    }
    return result;
  }
}

