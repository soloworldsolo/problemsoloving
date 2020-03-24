package com.solo.algoexpert.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Write a function that takes in a "special" array and returns its product sum. A "special" array
 * is a non-empty array that contains either integers or other "special" arrays. The product sum of
 * a "special" array is the sum of its elements, where "special" arrays inside it should be summed
 * themselves and then multiplied by their level of depth. For example, the product sum of [x, y] is
 * x + y; the product sum of [x, [y, z]] is x + 2y + 2z.
 *
 * Sample input: [5, 2, [7, -1], 3, [6, [-13, 8], 4]] Sample output: 12 (calculated as: (5 + 2 + 2 *
 * (7 - 1) + 3 + 2 * (6 + 3 * (-13 + 8) + 4)))
 */
public class ProductSum {

  public static int productSum(List<Object> array) {
    Objects.requireNonNull(array, "input cannot be empty");
    return productSumHelper(array, 1);

  }

  private static int productSumHelper(List<Object> o, int multipler) {
    int sum = 0;
    for (Object sub : o) {
      if (sub instanceof ArrayList) {
        sum += productSumHelper((ArrayList) sub, multipler + 1);
      } else {
        sum += (int) sub;
      }
    }
    return sum * multipler;
  }

}

class ProductSumTest {

  public static void main(String[] args) {
    List<Object> test =
        new ArrayList<Object>(
            Arrays.asList(
                5,
                2,
                new ArrayList<Object>(Arrays.asList(7, -1)),
                3,
                new ArrayList<Object>(

                    Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));

    System.out.println(ProductSum.productSum(test) == 12);
  }

}
