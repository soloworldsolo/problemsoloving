package com.solo;

public class Solosum {

  public static void main(String[] args) {
  countingValleys(8,"UDDDUDUU");
  }

  private static void calculate(int i) {
    int start = 0;
    int end = i - 1;

    while (start < end) {
      Math.pow(1,5);
    }
  }

  static int countingValleys(int n, String s) {
    char[] steps= s.toCharArray();
    int currentStep =0;
    int result =0;
    for(char step:steps){
      int stepValue = step=='U'?1:-1;
      if((currentStep+stepValue) ==0){
        result++;
      }
      currentStep +=stepValue;
    }

    return result;
  }
}
