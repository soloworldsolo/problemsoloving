package com.solo.leetcode;

public class BinaryTree {

  public boolean isValidBST(TreeNode head) {

    if (head == null) {
      return true;
    }

    return validateBSTHelper(head, null, null);

  }

  private boolean validateBSTHelper(TreeNode head, Integer min, Integer max) {

    if (max != null && head.val >= max) {
      return false;
    }

    if (min != null && head.val <= min) {
      return false;
    }
    if (head.left != null && !validateBSTHelper(head.left, min, head.val)) {
      return false;
    }
    if (head.right != null && !validateBSTHelper(head.right, head.val, max)) {
      return false;
    }
    return true;
  }

  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
