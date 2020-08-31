package com.solo.mit;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class YouWillComplyTest {

  YouWillComply youWillComply;

  @BeforeEach
  void setUp() {
    youWillComply = new YouWillComply();
  }

  @Test
  void name() {

    Boolean[] input = {false, true, true, false, true, false, false, true, true, true, false};
    Assertions.assertEquals(youWillComply.youWillComply(input),
        List.of(false, false, false, false, false, false, false, false, false, false, false));
  }
}