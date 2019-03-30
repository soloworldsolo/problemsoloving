package com.solo.alimetrik;

import java.util.Objects;

public class SumOfNaturalNumbers {

    public int ComputeSum(int number) {
        if(number <2)
            return 1;
        int result =1;
        for(int i=2;i<number;i++)
            if(number%i==0)
                result +=i;

        return  result;
    }
}
