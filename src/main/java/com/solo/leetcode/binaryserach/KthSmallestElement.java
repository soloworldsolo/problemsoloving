package com.solo.leetcode.binaryserach;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given the root of a binary search tree, and an integer k, return the kth (1-indexed) smallest
 * element in the tree.
 */
public class KthSmallestElement {

    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        treeHelper(root, stack);
        TreeNode resultnode = null;
        while (!stack.isEmpty() && k > 0) {
            resultnode = stack.pop();
            --k;
            while (!stack.isEmpty() && k > 0 && resultnode.right == null) {
                resultnode = stack.pop();
                k--;
            }
            if (k > 0) {
                stack.pop();
                treeHelper(resultnode.right, stack);
            }
        }
        return resultnode == null ? -1 : resultnode.val;

    }


    private void treeHelper(TreeNode tree, Deque<TreeNode> stack) {
        TreeNode current = tree;
        while (current != null) {
            if (current.right != null) {
                stack.push(current.right);
            }
            stack.push(current);
            current = current.left;
        }
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
