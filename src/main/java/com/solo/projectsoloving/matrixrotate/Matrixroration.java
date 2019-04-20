package com.solo.projectsoloving.matrixrotate;

import java.util.HashMap;
import java.util.Objects;
import java.util.TreeMap;

public class Matrixroration {

    private int temp;
   /*
        implementation is based on the assumption it is a square matrix
    */
    private int[][] compute(int[][] inputarray) {
        Objects.requireNonNull(inputarray,"input cannotbeempty");
        int numberofrows = inputarray.length -1;
        int numberofColumns = inputarray[0].length -1;
        if(numberofrows<1 || numberofColumns <1)
            return  inputarray;
        int i =0;
        int j=0;
         boolean iscompleted=false;
          temp = inputarray[i][j];
         int cycleCompleted=0;
        while (!iscompleted) {
            while(i<numberofrows && j< numberofColumns) {
               swap(i,j+1,inputarray);
               ++j;
            }

            while (i<numberofColumns && j>= numberofColumns) {
                swap(i+1,j,inputarray);
                ++i;
            }


            while (i>=numberofColumns && j>cycleCompleted) {
                swap(i,j-1,inputarray);
                --j;
            }

            while (i>cycleCompleted && j<numberofColumns) {
                swap(i-1,j,inputarray);
                --i;
            }

            numberofrows -= 1;
            numberofColumns -=1;

          if(numberofrows<=0 && numberofColumns <=0)
              iscompleted = true;

          else {
              i++;
              j++;
              temp = inputarray[i][j];
              cycleCompleted++;
          }
        }
       return inputarray;
    }

     private void swap(int i ,int j,int[][] input) {
        int innertemp = input[i][j];
        input[i][j] = temp;
        temp = innertemp;
     }
    
    public int[][] rotate(int[][] input) {
        return compute(input);
    }
}
