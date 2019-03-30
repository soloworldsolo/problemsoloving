package com.solo.alimetrik;

import java.util.Objects;

public class SumOfNaturalNumbers {

    public int ComputeSum(int number) {
        if(number <2)
            return 1;
        int result =1;
        for(int i=2;i<=Math.sqrt (number);i++)
            if(number%i==0) {
                if (i == (number / i))
                    result += i;
                else
                    result += (i + number / i);
            }


        return  result;
    }
}
