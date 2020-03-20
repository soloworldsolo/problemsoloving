package com.solo.designpatterns.bridgedesignpattern.bank;

import com.solo.designpatterns.bridgedesignpattern.payment.Payment;

public class HdfcBank extends Bank {

  public HdfcBank(Payment payment) {
    super(payment);
  }

  @Override
  public void pay() {
    payment.pay();
  }
}
