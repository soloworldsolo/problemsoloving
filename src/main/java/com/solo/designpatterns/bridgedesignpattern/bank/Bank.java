package com.solo.designpatterns.bridgedesignpattern.bank;

import com.solo.designpatterns.bridgedesignpattern.payment.Payment;

public abstract class Bank {

  protected Payment payment;

  Bank(Payment payment) {

    this.payment = payment;
  }

  public abstract void pay();
}
