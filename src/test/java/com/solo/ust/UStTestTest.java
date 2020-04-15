package com.solo.ust;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UStTestTest {

  UStTest uStTest;

  @BeforeEach
  void setUp() {
    uStTest = new UStTest();
  }

  @Test
  void getAmountWithDiscount() throws ParseException {
    Double expected = 176.00;
    LocalDate localDate = LocalDate.of(1988,12,12);
    Assertions.assertEquals(expected,uStTest.
        getAmountWithDiscount(200.0,Date.
            from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant())));
  }
}