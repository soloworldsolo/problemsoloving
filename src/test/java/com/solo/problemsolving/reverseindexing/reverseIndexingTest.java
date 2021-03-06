package com.solo.problemsolving.reverseindexing;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class reverseIndexingTest {

  ReverseIndexing<Integer> reverseIndexing;

  @BeforeEach
  public void init() {
    reverseIndexing = new ReverseIndexing<>();

  }


  @Test
  void getpositionalIndex() {
    List<Integer> integerList = Arrays.asList(10, 200, 3, 4000, 5);
    int result = reverseIndexing.getpositionalIndex(integerList, 4);

    Assertions.assertEquals(200, result);
  }

  @Test
  void getpositionalIndexleast() {
    List<Integer> integerList = Arrays.asList(42);
    Integer result = reverseIndexing.getpositionalIndex(integerList, 2);

    Assertions.assertEquals(null, result);


  }
}