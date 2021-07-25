package com.solo.trees.bst;

import com.solo.util.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;

public class InorderTraversal {

    public List<Integer> inorderTraverse(TreeNode node) {
        Objects.requireNonNull(node, "node cannot be null");
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current = node;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }
            current = stack.pop();
            result.add(current.getVal());
            current = current.getRight();
        }

        return result;
    }
}
