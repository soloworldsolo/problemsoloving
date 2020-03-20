package com.solo.hackerrank;

import static java.util.Objects.requireNonNull;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.TreeMap;

public class MaxNumberOfvotes {

  public String getResult(List<String> ballot) {
    requireNonNull(ballot);

    String key = ballot.
        stream().
        collect(groupingBy(identity(), TreeMap::new, counting()))
        .lastEntry().getKey();

    return key;
  }

}
