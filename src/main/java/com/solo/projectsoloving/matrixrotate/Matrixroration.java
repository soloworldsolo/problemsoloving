package com.solo.projectsoloving.matrixrotate;

import java.util.Objects;

public class Matrixroration {

    private int temp;

    private int[][] compute(int[][] inputarray) {
        Objects.requireNonNull(inputarray,"input cannotbeempty");
        int numberofrows = inputarray.length -1;
        int numbercofcolumns = inputarray[0].length -1;
        if(numberofrows<1 || numbercofcolumns <1)
            return  inputarray;
        int i =0;
        int j=0;
         boolean iscompleted=false;
          temp = inputarray[i][j];
         int cycldcompleted=0;
        while (!iscompleted) {
            while(i<numberofrows && j< numbercofcolumns) {
               swap(i,j+1,inputarray);
               ++j;
            }

            while (i<numbercofcolumns && j>= numbercofcolumns) {
                swap(i+1,j,inputarray);
                ++i;
            }


            while (i>=numbercofcolumns && j>cycldcompleted) {
                swap(i,j-1,inputarray);
                --j;
            }

            while (i>cycldcompleted && j<numbercofcolumns) {
                swap(i-1,j,inputarray);
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

     public void swap(int i ,int j,int[][] input) {
        int innertemp = input[i][j];
        input[i][j] = temp;
        temp = innertemp;
     }
    
    public int[][] rotate(int[][] input) {
        return compute(input);
    }
}
