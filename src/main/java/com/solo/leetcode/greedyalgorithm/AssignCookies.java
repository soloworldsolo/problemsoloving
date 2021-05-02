package com.solo.leetcode.greedyalgorithm;

import java.util.Arrays;

/**
 * Assume you are an awesome parent and want to give your children some cookies. But, you should
 * give each child at most one cookie.
 * <p>
 * Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will
 * be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j
 * to the child i, and the child i will be content. Your goal is to maximize the number of your
 * content children and output the maximum number.
 */
public class AssignCookies {

    public int findContentWithChildren(int[] greed, int[] size) {

        int contentedChildren = 0;
        Arrays.sort(greed);
        Arrays.sort(size);
        for (int i = 0; contentedChildren < greed.length && i < size.length; i++) {
            if (size[i] >= greed[contentedChildren]) {
                contentedChildren++;
            }
        }

        return contentedChildren;
    }
}
