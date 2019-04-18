package com.solo.sorting;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

public class MergeSort  {

    public int[] sort(int[] iterable) {
        var input = requireNonNull (iterable);
           int middle = input.length/2;
           split (input,0,middle-1);
           split (input,middle,input.length-1);
           merge(input,0,middle,input.length-1);
           return iterable;
    }

    private void split(int[] input, int startIndex, int endIndex) {
        int totallength = endIndex+1 - startIndex;
        int middle = startIndex+(totallength /2);

        if(startIndex == endIndex || middle <= startIndex)
            return;

        split (input, startIndex, middle-1);
        split (input,middle,endIndex);
        merge (input,startIndex,middle,endIndex);



    }

    private void merge(int[] input, int startIndex,int middleIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            int j= i;
            int middle =i+((endIndex +1- startIndex)/2);
            while (j<middle && middle <= endIndex) {
                if(input[j] > input[middle])
                    swap (input,j++,middle);
                else
                    j++;
            }

        }
    }


    private void swap(int[] input, int firstIndex,int secondIndex) {
        int temp= input[firstIndex];
        int secondValue = input[secondIndex];
        input[secondIndex]  = temp;
        input[firstIndex] = secondValue;

    }

    public static void main(String[] args) {
        MergeSort sort = new MergeSort ();
        int[] inputarray =  {14, 33, 27, 10, 35, 19, 42,44};
        sort.sort (inputarray);
    }
}
