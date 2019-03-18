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
         int cycldcompleted=0;
        while (!iscompleted) {
            while(i<numberofrows && j< numbercofcolumns) {
              int innerttemp = inputarray[i][j+1];
               inputarray[i][j+1] = temp;
               temp = innerttemp;
               ++j;
            }

            while (i<numbercofcolumns && j>= numbercofcolumns) {
                int innerttemp = inputarray[i+1][j];
                inputarray[i+1][j] = temp;
                temp = innerttemp;
                ++i;
            }


            while (i>=numbercofcolumns && j>cycldcompleted) {
                int innertemp = inputarray[i][j-1];
                inputarray[i][j-1] = temp;
                temp = innertemp;
                --j;
            }

            while (i>cycldcompleted && j<numbercofcolumns) {
                int innertemp = inputarray[i-1][j];
                inputarray[i-1][j] = temp;
                temp = innertemp;
                --i;
            }

            numberofrows -= 1;
            numbercofcolumns -=1;

          if(numberofrows<=0 && numbercofcolumns <=0)
              iscompleted = true;

          else {
              i++;
              j++;
              temp = inputarray[i][j];
              cycldcompleted++;
          }
        }

       return inputarray;
    }



    public int[][] rotate(int[][] input) {
        return compute(input);
    }
}
