package com.solo.java8;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

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
    countApplesAndOranges(7, 10, 4, 12, new int[]{2,3,4}, new int[]{3,-2,-4});
  }

  public static String method() {
    System.out.println("just doing some random execution");
    return "jjj";
  }

  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

    long appleCount = Arrays.stream(apples).map(i -> a+i).filter(app -> app>=s).count();

    long orangeCount = Arrays.stream(oranges).map(i -> b+i).filter(app -> app<=t).count();

    System.out.println("apple count"+appleCount);
    System.out.println("orange count"+orangeCount);


  }


}



