package com.solo.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers (unorder array) find the length of the longest subsequence such that elements in the
 * subsequence are consecutive integers. The consecutive numbers can be in any order.
 *
 * Input: arr[] = {12, 121, 30, 36, 41, 56, 13, 55, 35, 44, 33, 34, 92, 43, 32, 42}
 * Output: 5
 * Explanation:
 * The subsequence 32,33,34,35,36 is the longest. (Length 5)
 * There are other sequences as well like [41,42,43,44] , [12, 13], [55, 56] etc.  But above one is longest
 */
public class Question {

    public int subsequenceCount (int[] arr) {
        int result = 0;
        Arrays.sort(arr);
        int currentIndex =1;
        for(int i=1; i< arr.length ;i++) {
            if(arr[i] != arr[i-1]) {
                if(arr[i]  == arr[i-1]+1 ) {
                    currentIndex++;
                }else {
                    result = Math.max(result,currentIndex);
                    currentIndex =1;
                }
            }

        }

        return Math.max(result,currentIndex);
    }

    class Student {
        private int age;
        private String name;
        private List<String> subject;
    }
}
