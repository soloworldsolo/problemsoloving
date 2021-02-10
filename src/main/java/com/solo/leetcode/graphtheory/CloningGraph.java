package com.solo.leetcode.graphtheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CloningGraph {

  public Node cloneGraph(Node node) {

    if (node == null) {
      return node;
    }
    Map<Node, Node> nodeList = new HashMap<>();
    Queue<Node> nodeQueue = new LinkedList<>();
    Node parent = new Node(1, new ArrayList<>());
    nodeList.put(node, parent);
    nodeQueue.add(node);

    while (nodeQueue != null) {
      Node node1 = nodeQueue.poll();
      for (Node node2 : node1.neighbors) {
        if (!nodeList.containsKey(node2)) {
          parent = new Node(node2.val, new ArrayList<>());
          nodeList.put(node2, parent);
          nodeQueue.add(node2);
        }
        nodeList.get(node1).neighbors.add(nodeList.get(node2));
      }
    }

    return nodeList.get(node);

  }


  private static class Node {

    private int val;
    private List<Node> neighbors;

    public Node() {
    }

    public Node(int value,
        List<Node> adjacencyList) {
      this.val = value;
      this.neighbors = adjacencyList;
    }

    public int getValue() {
      return val;
    }

    public void setValue(int value) {
      this.val = val;
    }

    public List<Node> getAdjacencyList() {
      return neighbors;
    }

    public void setAdjacencyList(
        List<Node> adjacencyList) {
      this.neighbors = adjacencyList;
    }
  }

}
