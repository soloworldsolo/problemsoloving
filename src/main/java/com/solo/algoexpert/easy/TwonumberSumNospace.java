package com.solo.algoexpert.easy;

import java.util.Arrays;
import java.util.Objects;

import static java.util.Objects.*;

public class TwonumberSumNospace {

    public int[] computeSum(final int[] input, final int sum) {
        requireNonNull (input);
        int startindex = 0;
        int endindex = input.length-1;
          Arrays.sort (input);
         while (startindex != endindex) {
             int computed_esum = input[startindex]+ input[endindex];
             if(computed_esum == sum)
                 return new int[]{input[startindex], input[endindex]};
             else if(computed_esum> sum)
                     endindex--;
             else if(computed_esum < sum)
                 startindex++;

         }
        return new int[0];
    }
}
