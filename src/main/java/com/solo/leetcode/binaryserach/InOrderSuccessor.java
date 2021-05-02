package com.solo.leetcode.binaryserach;

/**
 * Given the root of a binary search tree and a node p in it, return the in-order successor of that
 * node in the BST. If the given node has no in-order successor in the tree, return null.
 * <p>
 * The successor of a node p is the node with the smallest key greater than p.val.
 */
public class InOrderSuccessor {

    public TreeNode getInorderSuccesseror(TreeNode root, TreeNode n) {
        if (root == null || n == null) {
            return null;
        }

        if (n.right != null) {
            TreeNode currentNode = n.right;
            while (currentNode.left != null) {
                currentNode = currentNode.left;
            }
            return currentNode;
        }
        TreeNode left = null;
        TreeNode current = root;
        while (current != null && current.val != n.val) {
            if (current.val > n.val) {
                left = current;
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return left;
    }

    private static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
