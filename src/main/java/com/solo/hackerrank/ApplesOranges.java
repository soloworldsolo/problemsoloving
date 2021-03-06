package com.solo.hackerrank;

/**
 * Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the
 * information given below, determine the number of apples and oranges that land on Sam's house. In
 * the diagram below: The red region denotes the house, where  is the start point, and  is the
 * endpoint. The apple tree is to the left of the house, and the orange tree is to its right. Assume
 * the trees are located on a single point, where the apple tree is at point , and the orange tree
 * is at point . When a fruit falls from its tree, it lands  units of distance from its tree of
 * origin along the -axis. *A negative value of means the fruit fell  units to the tree's left, and
 * a positive value of  means it falls  units to the tree's right. *
 * <p>
 * <p>
 * <p>
 * Given the value of  for  apples and  oranges, determine how many apples and oranges will fall on
 * Sam's house (i.e., in the inclusive range )? For example, Sam's house is between  and . The apple
 * tree is located at  and the orange at . There are  apples and  oranges. Apples are thrown  units
 * distance from , and  units distance. Adding each apple distance to the position of the tree, they
 * land at . Oranges land at . One apple and two oranges land in the inclusive range  so we print
 */
public class ApplesOranges {

  public int[] countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

    int appleCount = 0;
    int orangeCount = 0;

    for (int apple : apples) {
      int positon = apple + a;
      if (apple >= 0 && positon >= s && positon <= t) {
        appleCount++;
      }
    }

    for (int orange : oranges) {
      int position = orange + b;
      if (orange <= 0 && position <= t && position >= s) {
        orangeCount++;
      }
    }

    return new int[]{appleCount, orangeCount};

  }


}
