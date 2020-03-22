package com.solo.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Workouts {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    map.put(null, null);
    map.put(null, "solo");
    for (Map.Entry<String, String> pppp : map.entrySet()) {
      System.out.println(pppp.getKey());
      System.out.println(pppp.getValue());
    }
    map.computeIfAbsent("solo" ,key -> "hello world");
    map.computeIfPresent(null, (key,value)-> value+value);
    System.out.println(map);
    List<String> arrays = Arrays.asList("a", "b");
    arrays.replaceAll(String::toLowerCase);
    arrays.stream().forEach(System.out::println);
  }

  public static String method() {
    System.out.println("just doing some random execution");
    return "jjj";
  }


}
