package com.solo.algoexpert.medium;

import com.solo.algoexpert.medium.dynamicprogramming.SmallDifferenceArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmallDifferenceArrayTest {

  SmallDifferenceArray smallDifferenceArray;

  @BeforeEach
  void setUp() {
     smallDifferenceArray = new SmallDifferenceArray();
  }

  @Test
  void sanityTest() {
    int[] input1 = {-1, 5, 10, 20, 28, 3};
    int[] input2 ={26, 134, 135, 15, 17};
    int[] result ={28,26};
    Assertions.assertArrayEquals(result,smallDifferenceArray.smallestDifference(input1,input2));
  }

  @Test
  void testCase2() {
    int[] expected = {25, 1005};
    int[] input1 =new int[] {10, 0, 20, 25, 2200};
    int[] input2=    new int[] {1005, 1006, 1014, 1032, 1031};
    Assertions.assertArrayEquals(expected,smallDifferenceArray.smallestDifference(input1,input2));


  }

  @Test
  void testCase3() {
    int[] expected = {20, 17};
    int[] input1 =new int[] {-1, 5, 10, 20, 3};
    int[] input2=    new int[] {26, 134, 135, 15, 17};
    Assertions.assertArrayEquals(expected,smallDifferenceArray.smallestDifference(input1,input2));
  }

  @Test
  void testcase4() {
    int[] expected = {2000, 1032};
   int[] input1= new int[] {10, 0, 20, 25, 2000};
   int[] input2= new int[] {1005, 1006, 1014, 1032, 1031};
      Assertions.assertArrayEquals(expected,smallDifferenceArray.smallestDifference(input1,input2));


      }
  @Test
  void testcase5() {
    int[] expected = {954, 954};
    int[] input1= new int[] {240, 124, 86, 111, 2, 84, 954, 27, 89};
    int[] input2= new int[] {1, 3, 954, 19, 8};
    Assertions.assertArrayEquals(expected,smallDifferenceArray.smallestDifference(input1,input2));


  }
}