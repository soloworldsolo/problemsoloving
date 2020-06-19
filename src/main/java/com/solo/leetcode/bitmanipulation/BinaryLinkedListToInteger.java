package com.solo.leetcode.bitmanipulation;

import com.solo.leetcode.ReverseLinkedList.ListNode;

public class BinaryLinkedListToInteger {

  public int binaryLinkedListToInteger(ListNode head) {
    int result = 0;
    while (head != null) {
      result = (result << 1) | head.getVal();
      head = head.getNext();
    }

    return result;
  }

}
