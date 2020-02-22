package com.solo.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CompareTriplets {

  public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

    Objects.requireNonNull(a, "List should not be  empty");
    Objects.requireNonNull(b, "List should not be  empty");

    int player_a = 0;
    int player_b = 0;
    int i = 0;
    int max = 3;

    while (i < 3) {
      int pllayerAValue = a.get(i);
      int playerBValue = b.get(i);

      if (pllayerAValue > playerBValue) {
        ++player_a;
      }

      if (playerBValue > pllayerAValue) {
        ++player_b;
      }

      i++;

    }

    return Arrays.asList(player_a, player_b);


  }


}
