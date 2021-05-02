package com.solo.leetcode.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WordSearchTest {

    private WordSearch wordSearch;

    @BeforeEach
    void setUp() {
        wordSearch = new WordSearch();
    }

    @Test
    void test1() {
        var input = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        assertTrue(wordSearch.exist(input, "ABCCED"));
    }
}