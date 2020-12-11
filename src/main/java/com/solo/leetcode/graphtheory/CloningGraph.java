package com.solo.leetcode.graphtheory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CloningGraph {

  public Node cloneGraph(Node node) {

    if (node == null) {
      return node;
    }
    Map<Node, List<Node>> nodelist = new HashMap<>();
    LinkedList<Node> neighbourlist = new LinkedList<>();

    if (!nodelist.containsKey(node)) {

    }

    return null;

  }


  private static class Node<T> {

    private T value;
    private List<Node<T>> adjacencyList;

    public Node() {
    }

    public Node(T value,
        List<Node<T>> adjacencyList) {
      this.value = value;
      this.adjacencyList = adjacencyList;
    }

    public T getValue() {
      return value;
    }

    public void setValue(T value) {
      this.value = value;
    }

    public List<Node<T>> getAdjacencyList() {
      return adjacencyList;
    }

    public void setAdjacencyList(
        List<Node<T>> adjacencyList) {
      this.adjacencyList = adjacencyList;
    }
  }

}
