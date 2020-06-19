package com.solo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementTwo {

  public List<Integer> majorityElement(int[] element) {
    List<Integer> result = new ArrayList<>();

    if (element == null || element.length == 0) {
      return result;
    }
    int count1 = 0;
    int count2 = 0;
    int max1 = 0;
    int max2 = 0;
    for (int item : element) {

      if (max1 == item) {
        count1++;
      } else if (max2 == item) {
        count2++;
      } else if (count1 == 0) {
        max1 = item;
        count1++;
      } else if (count2 == 0) {
        max2 = item;
        count2++;
      } else {
        count1--;
        count2--;
      }

    }

    count1 = 0;
    count2 = 0;
    for (int value : element) {
      if (value == max1) {
        count1++;
      } else if (value == max2) {
        count2++;
      }
    }
    if (count1 > element.length / 3) {
      result.add(max1);
    }
    if (count2 > element.length / 3) {
      result.add(max2);
    }
    return result;

  }
}