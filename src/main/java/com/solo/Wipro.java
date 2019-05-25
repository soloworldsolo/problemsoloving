package com.solo;

public class Wipro {

    public static void process(int input) {
        if (input < 1)
            throw new IllegalArgumentException ("number must be greater than zero");
        System.out.println ( );
        int currentelent = 0;
        for (int i = 1; i <= input; i++) {
            if ((i & 1) == 0) {
             for(int j=i;j>=1;j--) {
                 System.out.print (j+currentelent);
             }
             currentelent+=i;
            } else {
          for(int j=1;j<=i;j++) {
              System.out.print(++currentelent);
          }

            }
            System.out.println ( );
        }
    }
    public static void main(String[] args) {
        process (6);
    }
}
