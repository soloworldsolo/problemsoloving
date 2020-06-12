package com.solo.leetcode;

import com.solo.leetcode.BinaryTree.TreeNode;
import com.solo.leetcode.ReverseLinkListRange.ListNode;

public class SortedListToBinary {

  public TreeNode sortedListToBST(ListNode head) {
    if (head == null) {
      return null;
    }
    TreeNode resultNode = null;
    ListNode currentPointer = middleElement(head);
    if (currentPointer != null) {
      resultNode = new TreeNode(currentPointer.val);
      if (currentPointer == head) {
        return resultNode;
      }
      resultNode.left = sortedListToBST(head);
      resultNode.right = sortedListToBST(currentPointer.next);
    }
    return resultNode;
  }

  public ListNode middleElement(ListNode head) {
    ListNode currentPointer = head;
    ListNode fastPointer = head;
    while ((fastPointer != null) && (fastPointer.next != null)) {
      currentPointer = currentPointer.next;
      fastPointer = fastPointer.next.next;
    }

    return currentPointer;
  }

}
