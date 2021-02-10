package com.solo.problemworkouts;

public class ExceptionFlow {

  static void Test() throws RuntimeException {

    System.out.println("TesT");
      throw new RuntimeException();

  }

  public static void main(String[] args) {
    try {
      String input = "This is a test";
      String[] tokens = input.split("\\s");
      Test();
      System.out.println(tokens.length);
    } catch (RuntimeException e) {
      System.out.println("Run time Exception");
    }
    System.out.println("end");

  }
}
