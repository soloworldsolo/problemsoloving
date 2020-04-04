package com.solo.hackerrank;

public class Staircase {

  public static  void staircase(int number) {
    for(int i=1;i<=number;i++){
      StringBuilder builder = new StringBuilder();
      int j=1;
      while ( j<= number){
        builder.append((number-j)>=i? " ":"#");
        j++;
      }
      System.out.println(builder.toString());
    }


  }

  public static void main(String[] args) {
    Staircase.staircase(4);
  }

}
