package com.solo.algoexpert.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoNumberSumSpace {

    public static void main(String[] args) {
        int[][] inputarary = {{1,2,2},{3,3,9} ,{9,3,1}};

        String collect = Arrays.stream (inputarary).
                flatMapToInt (input -> Arrays.stream (input))
                .mapToObj (i -> String.valueOf (i)).collect (Collectors.joining (","));

        System.out.println (collect );
    }

}
