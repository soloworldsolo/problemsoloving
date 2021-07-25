package com.solo.leetcode.divideandconquer;

import com.solo.util.TreeNode;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a
 * binary tree and inorder is the inorder traversal of the same tree, construct and return the
 * binary tree. Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7] Output:
 * [3,9,20,null,null,15,7]
 */
public class ConstructTree {

    public TreeNode constructTree(int[] inorder, int[] postorder) {
        Map<Integer, Boolean> map = new HashMap<>();
        Map<Integer, Integer> postOrderIndex = generatePostOrder(inorder, postorder);
        TreeNode node = new TreeNode(postorder[0]);
        map.putIfAbsent(node.getVal(), true);
        int index = getIndex(node.getVal(), inorder);
        node.setLeft(getChild(0, -1, index - 1, inorder, postorder, map, postOrderIndex));
        node.setRight(
            getChild(0, index + 1, inorder.length - 1, inorder, postorder, map, postOrderIndex));
        return node;
    }

    private Map<Integer, Integer> generatePostOrder(int[] inorder, int[] postorder) {
        return IntStream.range(0, postorder.length)
            .boxed()
            .collect(Collectors.toMap(i -> postorder[i], i -> i));

    }

    private TreeNode getChild(int currentValue, int startIndex, int endIndex, int[] inorder,
        int[] postorder,
        Map<Integer, Boolean> map, Map<Integer, Integer> postIndex) {
        if (startIndex < 0 || endIndex >= inorder.length) {
            return null;
        }
        if (startIndex == endIndex) {
            return new TreeNode(inorder[startIndex]);
        }
        Integer childNode = null;
        TreeNode node = new TreeNode(-1);

        return null;
    }

    private int getIndex(int value, int[] inorder) {
        int index = 0;
        for (int val : inorder

        ) {
            if (val == value) {
                return index;
            }
            index++;
        }
        return index;
    }
}
