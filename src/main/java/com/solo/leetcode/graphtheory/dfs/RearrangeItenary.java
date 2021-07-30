package com.solo.leetcode.graphtheory.dfs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Given a list of airline tickets represented by pairs of departure and arrival airports [from,
 * to], reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK.
 * Thus, the itinerary must begin with JFK.
 *
 * Given a list of airline tickets represented by pairs of departure and arrival airports [from,
 * to], reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK.
 * Thus, the itinerary must begin with JFK.
 */
public class RearrangeItenary {

  public List<String> findItinerary(List<List<String>> tickets) {
    Map<String, Boolean> visitedEdges = new HashMap<>();
    Map<String, PriorityQueue<String>> adjacencyList = getAdjacencyList(tickets, visitedEdges);
    Deque<String> result = new ArrayDeque<>();
    Deque<String> destinationStack = new ArrayDeque<>();
    String currentValue = "JFK";
    while (currentValue != null || !destinationStack.isEmpty()) {
      if (!visitedEdges.containsKey(currentValue)) {

        destinationStack.push(currentValue);
        PriorityQueue<String> adjacencyLis = adjacencyList.get(currentValue);

        currentValue =
            (adjacencyLis == null || adjacencyLis.isEmpty()) ? null : adjacencyLis.poll();
      }
      if (currentValue == null && !destinationStack.isEmpty()) {
        result.add(destinationStack.pop());
        visitedEdges.putIfAbsent(currentValue, true);
      }
      if (currentValue == null && !destinationStack.isEmpty()) {
        currentValue = destinationStack.pop();
      }

    }
    return reverseStack(result);
  }

  private List<String> reverseStack(Deque<String> result) {
    LinkedList<String> strings = new LinkedList<>();
    while (!result.isEmpty()) {
      strings.addFirst(result.pop());
    }
    return strings;
  }

  private Map<String, PriorityQueue<String>> getAdjacencyList(List<List<String>> schuffeledList,
      Map<String, Boolean> visitedEdges) {
    Map<String, PriorityQueue<String>> adjacencyList = new HashMap<>();
    for (List<String> destinationList : schuffeledList) {
      var list = adjacencyList
          .getOrDefault(destinationList.get(0), new PriorityQueue<>());
      list.add(destinationList.get(1));
      adjacencyList.putIfAbsent(destinationList.get(0), list);
    }

    return adjacencyList;
  }

  public List<String> findItineraryworking(List<List<String>> tickets) {
    Map<String, PriorityQueue<String>> flights = new HashMap<>();
    LinkedList<String> path = new LinkedList<>();
    for (List<String> ticket : tickets) {
      flights.putIfAbsent(ticket.get(0), new PriorityQueue<>());
      flights.get(ticket.get(0)).add(ticket.get(1));
    }
    dfs("JFK", flights, path);
    return path;
  }

  public void dfs(String departure, Map<String, PriorityQueue<String>> flights,
      LinkedList<String> path) {
    PriorityQueue<String> arrivals = flights.get(departure);
    while (arrivals != null && !arrivals.isEmpty()) {
      dfs(arrivals.poll(), flights, path);
    }
    path.addFirst(departure);
  }
}
