package com.solo.projectsolving.spiralarray;

public class SpiralArray {

        public static void main(String[] args) {
            int[][] a = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

            int columwidth = 4;
            int rowwidth = 4;
            int colindex =0;
            int rowindex =0;

            while (colindex<columwidth &&  rowindex< rowwidth) {
                for(int i=rowindex;i<columwidth;++i)
                    System.out.print(a[rowindex][i]);

                System.out.println("");


                rowindex++;

                for(int i= rowindex;i<rowwidth;i++)
                    System.out.print(a[i][columwidth-1]);
                System.out.println("");

                columwidth--;


                for(int i=columwidth-1;i>=colindex;i--)
                    System.out.print(a[columwidth][i]);

                colindex++;
                System.out.println("");

                for(int i=columwidth-rowindex;i>=rowindex;i--)
                    System.out.print(a[i][rowindex-1]);
                --rowwidth;

            }

        }


    }


