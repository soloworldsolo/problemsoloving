package com.solo.common.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PairTest {

  @Test
  void testingGenerics() {
    Pair<Integer, Integer> programPair = new Pair<>(2, 3);
    Assertions.assertNotNull(programPair, "object should not be empty");
    Assertions.assertTrue(programPair.isElementOnePresent());
    Assertions.assertTrue(programPair.isElementtwoPresent());

  }
}