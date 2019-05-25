package com.solo.hackerrank;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class PairOfStocks {

    public int compute(int[] input) {
        Objects.requireNonNull (input,"input should not be empty");
       Map<Integer,Integer> stockcountmap = new HashMap<> ();
       for(int stock:input) {
           Integer integer = stockcountmap.get (stock);
           if(integer == null)
               stockcountmap.put (stock,1);
           else
               stockcountmap.put (stock,++integer);
       }
            int result =0;
          if(stockcountmap!= null && !stockcountmap.isEmpty ()) {
              for(Map.Entry<Integer,Integer> integerEntry: stockcountmap.entrySet ()){
                  if(integerEntry.getValue () >1) {
                      result += (integerEntry.getValue ()/2);
                  }
              }
          }

       return  result;
    }
}
