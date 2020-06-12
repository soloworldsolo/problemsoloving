package com.solo.leetcode;

import com.solo.leetcode.BinaryTree.TreeNode;

public class MaximumDepthBinaryTree {

  public int minDepth(TreeNode root) {

    if (root == null) {
      return 0;
    }

    if (root.left == null && root.right == null) {
      return 1;
    }
    int minDepth = Integer.MAX_VALUE;

    if (root.left != null) {
      minDepth = Math.min(minDepth(root.left), minDepth);
    }

    if (root.right != null) {
      minDepth = Math.min(minDepth(root.right), minDepth);

    }

    return minDepth + 1;
  }

  public int minDepthIteration(TreeNode root) {

    if (root == null) {
      return 0;
    }

    if (root.left == null && root.right == null) {
      return 1;
    }
    return -1;
  }


}
