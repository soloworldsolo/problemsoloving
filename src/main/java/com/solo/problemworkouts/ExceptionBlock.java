package com.solo.problemworkouts;

public class ExceptionBlock {

  public static void main(String[] args) {
    ExceptionBlock block = new ExceptionBlock();
    block.printValues(args);

  }

  void printValues(String[] strings) {
    try {
      System.out.println(strings[0] + "" + strings[1]);
    } catch (NullPointerException e) {
      System.out.println("Null pointer Exception");
    } catch (IndexOutOfBoundsException exc) {
      System.out.println("Index out of bound exception");
    }
  }
}
