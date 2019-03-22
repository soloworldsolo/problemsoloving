package com.solo.multiplication;

import java.util.Objects;
import java.util.function.BiFunction;

public class Matrixmultiplication {
   /*
      multiples two matrix and returns the result
      assumes both the matrix are of the same size
      (i.e) square matrix
      @param1 expects a  non empty two dimensional matrix , throws null pointer exception
      @param2 expects a non empty two  dimensional matrix
    */
    public int[][] multiply(final int[][] matrix1,final int[][] matrix2) {
        final int[][] first = Objects.requireNonNull (matrix1, "matrix1 should not be empty");
        final int[][] second = Objects.requireNonNull (matrix2,"matrix2 should not be empty");

       int[][] result = new int[first.length][first[0].length];

        int resultrowindex = 0;
       int resultcolumnindex =0;

       while(resultrowindex < result.length) {
           while (resultcolumnindex < result[0].length) {
               result[resultrowindex][resultcolumnindex] = compute(first,second,resultrowindex,resultcolumnindex);
               resultcolumnindex++;
           }

           resultrowindex++;
           resultcolumnindex=0;
       }

        return result;
    }

    private int compute(int[][] first, int[][] second, int resultrowindex, int resultcolumnindex) {
        int res=0;
         int index =0;
         while (index<first.length)  {
             res += first[resultrowindex][index] * second[index][resultcolumnindex];
             index++;
         }

       return res;
    }
}
