package com.solo.leetcode.backtracking;

/**
 * Given an m x n gird of characters board and a string word, return true if word exists in the
 * grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are
 * horizontally or vertically neighboring. The same letter cell may not be used more than once.
 */
public class WordSearch {

    private int rows;
    private int coloumns;

    public boolean exist(char[][] board, String word) {
        this.rows = board.length;
        this.coloumns = board[0].length;
        boolean[][] visited = new boolean[rows][coloumns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                if (dfs(i, j, word, board, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, String word, char[][] board, int index, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= rows || j < 0 || j >= coloumns || word.charAt(index) != board[i][j]
                || visited[i][j]) {
            return false;
        }
        boolean valid = false;
        char temp = board[i][j];
        visited[i][j] = true;
        board[i][j] = (char) 0;
        int[][] paths = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        for (int[] path : paths) {
            if (dfs(i + path[0], j + path[1], word, board, index + 1, visited)) {
                valid = true;
                break;
            }

        }
        board[i][j] = temp;
        visited[i][j] = false;
        return valid;
    }
}
