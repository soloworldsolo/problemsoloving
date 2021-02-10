package com.solo.leetcode.bfs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Let's play the minesweeper game (Wikipedia, online game)!
 *
 * You are given a 2D char matrix representing the game board. 'M' represents an unrevealed mine,
 * 'E' represents an unrevealed empty square, 'B' represents a revealed blank square that has no
 * adjacent (above, below, left, right, and all 4 diagonals) mines, digit ('1' to '8') represents
 * how many mines are adjacent to this revealed square, and finally 'X' represents a revealed mine.
 *
 * Now given the next click position (row and column indices) among all the unrevealed squares ('M'
 * or 'E'), return the board after revealing this position according to the following rules:
 *
 * If a mine ('M') is revealed, then the game is over - change it to 'X'. If an empty square ('E')
 * with no adjacent mines is revealed, then change it to revealed blank ('B') and all of its
 * adjacent unrevealed squares should be revealed recursively. If an empty square ('E') with at
 * least one adjacent mine is revealed, then change it to a digit ('1' to '8') representing the
 * number of adjacent mines. Return the board when no more squares will be revealed.
 */
public class MineSweeper {

  /**
   * if the clicked position is mine mark it as X and exit the board if not check the adjacent nodes
   * in the grid[8]  if there is any mine change it to the number of mines found and stop proceeding
   * further through the node if no mines are present then mark it as 'B' and proceed further
   *
   * @param board board positions
   * @param click position
   * @return updated board
   */
  public char[][] bfsIteration(char[][] board, final int[] click) {
    int numberOfRows = board.length;
    int numberOfColumns = board[0].length;
    int leftPosition = click[0];
    int rightPosition = click[1];
    if (board[leftPosition][rightPosition] == 'M') {
      board[leftPosition][rightPosition] = 'X';
    } else {
      Queue<Integer> adjacencyQueue = new LinkedList<>();
      adjacencyQueue.add(leftPosition * numberOfColumns + rightPosition);
      while (!adjacencyQueue.isEmpty()) {
        int positon = adjacencyQueue.poll();
        int xposition = positon / numberOfColumns;
        int yposition = positon % numberOfColumns;
        int count = 0;
        for (int i = -1; i < 2; i++) {
          for (int j = -1; j < 2; j++) {
            if (!(i == 0 && j == 0)) {
              if (xposition + i >= 0 && yposition + j >= 0 &&
                  xposition + i < numberOfRows && yposition + j < numberOfColumns
                  && (board[xposition + i][yposition + j] == 'M'
                  || board[xposition + i][yposition + j] == 'X')) {
                count++;
              }
            }
          }
        }
        if (count > 0) {
          board[xposition][yposition] = (char) (count + '0');
        } else {
          board[xposition][yposition] = 'B';
          for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
              if (!(i == 0 && j == 0)) {
                int xpos = xposition + i;
                int ypos = yposition + j;
                if (xposition + i >= 0 && yposition + j >= 0 &&
                    xposition + i < numberOfRows && yposition + j < numberOfColumns
                    && board[xposition + i][yposition + j] == 'E'
                ) {
                  adjacencyQueue.add(xpos * numberOfColumns + ypos);
                  board[xpos][ypos] = 'B';
                }
              }
            }
          }
        }
      }
    }
    return board;
  }

  public char[][] dfsRecursion(char[][] input, int[] click) {
    if (input[click[0]][click[1]] == 'M') {
      input[click[0]][click[1]] = 'X';
      return input;
    }
    dfs(input, click[0], click[1]);
    return input;
  }

  private void dfs(char[][] input, int xposition, int yposition) {
    int count = 0;
    int nofRows = input.length;
    int nofColumns = input[0].length;
    if (xposition < 0 || yposition < 0 || xposition >= nofRows ||
        yposition >= nofColumns || input[xposition][yposition] != 'E') {
      return;
    }
    for (int i = -1; i < 2; i++) {
      for (int j = -1; j < 2; j++) {
        if (!(i == 0 && j == 0)) {

          if (xposition + i >= 0 && xposition + i < nofRows && yposition + j >= 0 &&
              yposition + j < nofColumns && input[xposition + i][yposition + j] == 'M') {
            count++;
          }
        }
      }
    }
    if (count > 0) {
      input[xposition][yposition] = (char) (count + '0');
    } else {
      input[xposition][yposition] = 'B';
      for (int i = -1; i < 2; i++) {
        for (int j = -1; j < 2; j++) {
          if (!(i == 0 && j == 0)) {

            if (xposition + i >= 0 && xposition + i < nofRows && yposition + j >= 0 &&
                yposition + j < nofColumns && input[xposition + i][yposition + j] == 'E') {
              dfs(input, xposition + i, yposition + j);
            }
          }
        }
      }
    }
  }

  public char[][] dfsIteration(char[][] board, int[] click) {
    int numberOfRows = board.length;
    int numberOfColumns = board[0].length;
    int leftPosition = click[0];
    int rightPosition = click[1];
    if (board[leftPosition][rightPosition] == 'M') {
      board[leftPosition][rightPosition] = 'X';
    } else {
      Deque<Integer> adjacencyQueue = new ArrayDeque<>();
      adjacencyQueue.push(leftPosition * numberOfColumns + rightPosition);
      while (!adjacencyQueue.isEmpty()) {
        int positon = adjacencyQueue.pop();
        int xposition = positon / numberOfColumns;
        int yposition = positon % numberOfColumns;
        int count = 0;
        for (int i = -1; i < 2; i++) {
          for (int j = -1; j < 2; j++) {
            if (!(i == 0 && j == 0)) {
              if (xposition + i >= 0 && yposition + j >= 0 &&
                  xposition + i < numberOfRows && yposition + j < numberOfColumns
                  && (board[xposition + i][yposition + j] == 'M'
                  || board[xposition + i][yposition + j] == 'X')) {
                count++;
              }
            }
          }
        }
        if (count > 0) {
          board[xposition][yposition] = (char) (count + '0');
        } else {
          board[xposition][yposition] = 'B';
          for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
              if (!(i == 0 && j == 0)) {
                int xpos = xposition + i;
                int ypos = yposition + j;
                if (xposition + i >= 0 && yposition + j >= 0 &&
                    xposition + i < numberOfRows && yposition + j < numberOfColumns
                    && board[xposition + i][yposition + j] == 'E'
                ) {
                  adjacencyQueue.push(xpos * numberOfColumns + ypos);
                  board[xpos][ypos] = 'B';
                }
              }
            }
          }
        }
      }
    }
    return board;
  }
}

