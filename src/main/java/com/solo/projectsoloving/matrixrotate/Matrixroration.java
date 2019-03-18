package com.solo.projectsoloving.matrixrotate;

import java.util.Objects;

public class Matrixroration {


    private int[][] compute(int[][] inputarray) {
        Objects.requireNonNull(inputarray,"input cannotbeempty");
        int numberofrows = inputarray.length -1;
        int numbercofcolumns = inputarray[0].length -1;
        if(numberofrows<1 || numbercofcolumns <1)
            return  inputarray;
        int i =0;
        int j=0;
         boolean iscompleted=false;
         int temp = inputarray[i][j];
        while (!iscompleted) {
            if(i<=numberofrows && j<= numbercofcolumns) {
               temp = inputarray[i][j];
               inputarray[i][++j] = temp;
                System.out.println(inputarray[i][j]);
            }
          iscompleted = true;

        }

        return  inputarray;
    }

    private void swap(int i, int j) {

    }

    public int[][] rotate(int[][] input) {
        return compute(input);
    }
}
