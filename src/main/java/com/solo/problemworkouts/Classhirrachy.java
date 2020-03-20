package com.solo.problemworkouts;

public class Classhirrachy {

  static {
    System.out.println("static block");
  }

  Classhirrachy() {
    System.out.println("Constructor called");
  }

  public static void main(String[] args) {
    Classhirrachy classhirrachy = new Classhirrachy();
    System.out.println(" Main method");
  }
}
