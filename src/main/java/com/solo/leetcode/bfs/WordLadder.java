package com.solo.leetcode.bfs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

/**
 * Given two words (beginWord and endWord), and a dictionary's word list, find the length of
 * shortest transformation sequence from beginWord to endWord, such that:
 *
 * Only one letter can be changed at a time. Each transformed word must exist in the word list.
 * Note:
 *
 * Return 0 if there is no such transformation sequence. All words have the same length. All words
 * contain only lowercase alphabetic characters. You may assume no duplicates in the word list. You
 * may assume beginWord and endWord are non-empty and are not the same. Example 1:
 *
 * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
 *
 * Output: 5
 */
public class WordLadder {

  /**
   * @return int
   */
  public int wordLadder(String beginWord, String endWord, List<String> wordList) {
    int result = 0;
    if (wordList.contains(endWord)) {
      Map<String, Node<String>> adjacencyMap = new HashMap<>();
      buildAdjacencyMap(beginWord, wordList, adjacencyMap);
      return shortestPath(beginWord, endWord, adjacencyMap);
    }
    return result;
  }

  private int shortestPath(String beginWord, String endWord,
      Map<String, Node<String>> adjacencyMap) {
    Node<String> currentWord = adjacencyMap.get(beginWord);
    currentWord.path = 1;
    Queue<Node<String>> queue = new LinkedList<>();
    while (Objects.nonNull(currentWord) || !queue.isEmpty()) {
      if (!currentWord.isVisited) {
        currentWord.isVisited = true;
        addAdjacencyListToQueue(queue, currentWord, adjacencyMap);
      }
      currentWord = queue.poll();
    }

    return adjacencyMap.get(endWord).path;
  }

  private void addAdjacencyListToQueue(Queue<Node<String>> queue, Node<String> currentNode,
      Map<String, Node<String>> adjacencyMap) {
    Set<String> adjacencyList = currentNode.adjacencyList;
    if (adjacencyList != null && !adjacencyList.isEmpty()) {
      for (String node : adjacencyList) {
        if (adjacencyMap.containsKey(node)) {
          Node<String> childNode = adjacencyMap.get(node);
          if (childNode.path == 0 || (currentNode.path + 1 <= childNode.path)) {
            childNode.path = currentNode.path + 1;
          }
          queue.add(childNode);
        }

      }
    }
  }

  private void buildAdjacencyMap(String beginWord, List<String> wordList,
      Map<String, Node<String>> adjacencyMap) {
    String currentWord = beginWord;
    int index = -1;
    while (index < wordList.size()) {
      Node<String> currentNode = adjacencyMap
          .getOrDefault(currentWord, new Node<String>(currentWord, new HashSet<String>()));

      for (int i = 0; i < wordList.size(); i++) {
        if (i < wordList.size() && isNextChain(currentWord, wordList.get(i))) {
          Set<String> adjacencyList = currentNode.adjacencyList;
          adjacencyList.add(wordList.get(i));
        }
      }
      adjacencyMap.put(currentWord, currentNode);
      ++index;
      if (index < wordList.size()) {
        currentWord = wordList.get(index);

      }
    }


  }

  private boolean isNextChain(String first, String second) {
    int diff = 0;
    int index = 0;
    while (diff <= 1 && index < first.length()) {
      if (first.charAt(index) != second.charAt(index++)) {
        diff++;
      }
    }
    return diff == 1;
  }

  static class Node<T extends Comparable<T>> implements Comparable<Node<T>> {

    int path;
    boolean isVisited;
    private T name;
    private Set<T> adjacencyList;


    public Node(T name) {
      this.name = name;
    }

    public Node(T name, Set<T> adjacencyList) {
      this.name = name;
      this.adjacencyList = adjacencyList;
    }

    @Override
    public int compareTo(Node<T> o) {
      return this.name.compareTo(o.name);
    }
  }
}
