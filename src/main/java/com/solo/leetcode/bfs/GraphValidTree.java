package com.solo.leetcode.bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;

/**
 * if a graph is a Tree it satisfies teh following two proiperties 1) no cycle Exists
 *
 * 2) Graph is fully connected
 */
public class GraphValidTree {

  /**
   * performs a BST and determines if the Tree is valid or not
   *
   * @return boolean tree is valid or not
   */
  public boolean isValidTree(int n, int[][] edges) {
    if (n != edges.length + 1) {
      return false;
    }
    Objects.requireNonNull(edges);
    Map<Integer, List<Integer>> adjacencyMap = getAdjacencyMap(edges, n);
    return BSTTraversal(adjacencyMap, n);
  }

  private Map<Integer, List<Integer>> getAdjacencyMap(int[][] edges, int n) {
    Map<Integer, List<Integer>> graph = new HashMap<>();
    for (int i = 0; i < n; i++) {
      graph.put(i, new ArrayList<>());
    }
    for (int i = 0; i < edges.length; i++) {
      int parent = edges[i][0], child = edges[i][1];
      graph.get(parent).add(child);
      graph.get(child).add(parent);
    }
    return graph;
  }

  private boolean BSTTraversal(Map<Integer, List<Integer>> adjacencyMap, int numberOfNodes) {

    Map<Integer, Integer> parent = new HashMap<>();
    parent.put(0, -1);
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(0);

    while (!queue.isEmpty()) {
      int node = queue.poll();
      List<Integer> adjacencyList = adjacencyMap.get(node);
      if (adjacencyList != null && !adjacencyList.isEmpty()) {
        for (int neighbour : adjacencyList) {
          if (parent.get(node) == neighbour) {
            continue;
          }
          if (parent.containsKey(neighbour)) {
            return false;
          }
          queue.offer(neighbour);
          parent.put(neighbour, node);
        }
      }

    }

    return parent.size() == numberOfNodes;
  }

  public boolean unionFind(int n, int[][] edges) {
    if (edges.length != n - 1) {
      return false;
    }

    // Condition 2: The graph must contain a single connected component.
    // Create a new UnionFind object with n nodes.
    UnionFind unionFind = new UnionFind(n);
    // Add each edge. Check if a merge happened, because if it
    // didn't, there must be a cycle.
    for (int[] edge : edges) {
      int A = edge[0];
      int B = edge[1];
      if (!unionFind.union(A, B)) {
        return false;
      }
    }

    // If we got this far, there's no cycles!
    return true;
  }

  static class UnionFind {

    private int[] parent;
    private int[] size; // We use this to keep track of the size of each set.

    // For efficiency, we aren't using makeset, but instead initialising
    // all the sets at the same time in the constructor.
    public UnionFind(int n) {
      parent = new int[n];
      size = new int[n];
      for (int node = 0; node < n; node++) {
        parent[node] = node;
        size[node] = 1;
      }
    }

    // The find method, with path compression. There are ways of implementing
    // this elegantly with recursion, but the iterative version is easier for
    // most people to understand!
    public int find(int A) {
      // Step 1: Find the root.
      int root = A;
      while (parent[root] != root) {
        root = parent[root];
      }
      // Step 2: Do a second traversal, this time setting each node to point
      // directly at A as we go.
      while (A != root) {
        int oldRoot = parent[A];
        parent[A] = root;
        A = oldRoot;
      }
      return root;
    }

    // The union method, with optimization union by size. It returns True if a
    // merge happened, False if otherwise.
    public boolean union(int A, int B) {
      // Find the roots for A and B.
      int rootA = find(A);
      int rootB = find(B);
      // Check if A and B are already in the same set.
      if (rootA == rootB) {
        return false;
      }
      // We want to ensure the larger set remains the root.
      if (size[rootA] < size[rootB]) {
        // Make rootB the overall root.
        parent[rootA] = rootB;
        // The size of the set rooted at B is the sum of the 2.
        size[rootB] += size[rootA];
      } else {
        // Make rootA the overall root.
        parent[rootB] = rootA;
        // The size of the set rooted at A is the sum of the 2.
        size[rootA] += size[rootB];
      }
      return true;
    }
  }


}
