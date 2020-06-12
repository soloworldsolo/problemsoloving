package com.solo.leetcode;

import com.solo.leetcode.BinaryTree.TreeNode;

public class SymmetricTree {

  public boolean isSymmetricTree(TreeNode root) {
    return isSymmetricTreeHelp(root, root);
  }

  private boolean isSymmetricTreeHelp(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }
    if (left == null || right == null) {
      return false;
    }
    return (left.val == right.val && isSymmetricTreeHelp(left.left, right.right)
        && isSymmetricTreeHelp(left.right, right.left));
  }
}
