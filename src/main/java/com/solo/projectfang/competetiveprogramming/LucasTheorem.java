package com.solo.projectfang.competetiveprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
public class LucasTheorem {

    private int id;
    private int age;

    public int nCrModulus(int n, int r, int p) {
        if (r == 0) {
            return 1;
        }

        int ni = n % p;
        int ri = r % p;

        int np = n / p;
        int rp = r / p;

        return (nCrModulus(np, rp, p) * ncrDP(ni, ri, p)) % p;
    }

    private int ncrDP(int ni, int ri, int p) {
        int[] pascalTriangle = new int[ri + 1];
        pascalTriangle[0] = 1;

        for (int i = 1; i <= ni; i++) {
            for (int j = Math.min(i, ri); j > 0; j--) {
                pascalTriangle[j] = (pascalTriangle[j] + pascalTriangle[j - 1]) % p;
            }
        }
        return pascalTriangle[ri];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LucasTheorem that = (LucasTheorem) o;
        return id == that.id && age == that.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age);
    }

    private static List<Integer> calNearestNumber(List<Integer> inpList , int input ,
                                                  int noOfItems){
        List<Integer> result = new ArrayList<>();
        int index = 0;
        for(Integer inp: inpList) {
            if(inp == input) {
                break;
            }
        }

        if(index ==0) {
            int noOfcyc = noOfItems;
            int currIndex =1;
            while(noOfcyc >0) {
                result.add(result.get(currIndex++));
                noOfcyc --;
            }
        }
        else if(index ==inpList.size()-1) {
            int startIndex = index-1;
            int noOfcyc = noOfItems;
            while(noOfcyc >0) {
                result.add(result.get(startIndex++));
                noOfcyc --;
            }
        }else {
            if(index -1 >=0) {
                result.add(result.get(index-1));

            }

            if(index +1 < inpList.size()) {
                result.add(result.get(index+1));

            }

            int currentSize = inpList.size();

            while(currentSize < noOfItems) {
                int clockwise = index+2;
                int antiClockwise = index -2;
                int remainingItems = inpList.size() - noOfItems;
                while (remainingItems >0 ) {
                    if(clockwise < inpList.size()-1) {
                        result.add(result.get(clockwise++));
                        remainingItems--;
                    }

                    if(antiClockwise > 0) {
                        result.add(result.get(antiClockwise--));
                        remainingItems--;
                    }

                }
            }

        }
        return result;
    }
}
