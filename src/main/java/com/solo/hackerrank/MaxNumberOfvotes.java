package com.solo.hackerrank;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.Objects.requireNonNull;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class MaxNumberOfvotes {
    public String getResult(List<String> ballot) {
        requireNonNull (ballot);

        String key = ballot.
                stream ( ).
                collect (groupingBy (identity ( ), TreeMap::new, counting ( )))
                .lastEntry ( ).getKey ( );


        return  key;
    }

}
