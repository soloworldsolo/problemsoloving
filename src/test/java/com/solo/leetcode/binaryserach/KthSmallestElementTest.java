package com.solo.leetcode.binaryserach;

import com.solo.leetcode.binaryserach.KthSmallestElement.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KthSmallestElementTest {

    KthSmallestElement kthSmallestElement;


    @BeforeEach
    void setUp() {
        kthSmallestElement = new KthSmallestElement();
    }


    @Test
    void test1() {
        TreeNode treeNode = new TreeNode(5);

        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(6);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.left.left.left = new TreeNode(1);

        Assertions.assertEquals(3, kthSmallestElement.kthSmallest(treeNode, 3));
    }

    @Test
    void test2() {
        TreeNode treeNode = new TreeNode(3);

        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(4);
        treeNode.left.right = new TreeNode(2);

        Assertions.assertEquals(1, kthSmallestElement.kthSmallest(treeNode, 1));
    }

    @Test
    void test3() {
        TreeNode treeNode = new TreeNode(4);

        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);
        treeNode.left.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(1);

        Assertions.assertEquals(4, kthSmallestElement.kthSmallest(treeNode, 4));
    }
}