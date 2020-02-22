package com.solo.java8;

import java.util.*;

public class Workouts {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    map.put(null, null);
    map.put(null, null);
    for (Map.Entry<String, String> pppp : map.entrySet()) {
      System.out.println(pppp.getKey());
      System.out.println(pppp.getValue());
    }
  }


}
