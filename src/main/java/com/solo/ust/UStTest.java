package com.solo.ust;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
public class UStTest {
  public  boolean checkEventAvailable(String date) throws ParseException {
    int result = getMonthFromDate(date);
    return (getMonthFromDate(date)&1)==0;
  }

  public  Double getAmountWithDiscount(Double amount, Date date) throws ParseException {
    String dateFormat = new SimpleDateFormat("yyyy-MM-dd").format(date);
    if(date !=null && checkEventAvailable(dateFormat)) {
      return amount -((Double.valueOf(Double.valueOf(getMonthFromDate(date)))/ Double.valueOf(100)) * amount);
    }

    return amount;
  }

  public  int getMonthFromDate(Date date){
    LocalDate localDate = date.toInstant().
        atZone(ZoneId.systemDefault()).toLocalDate();
    localDate.getMonthValue();
    return localDate.getMonthValue();
  }

  public  int getMonthFromDate(String date) throws ParseException {
    return getMonthFromDate(new SimpleDateFormat("yyyy-MM-dd").parse(date));
  }
}





