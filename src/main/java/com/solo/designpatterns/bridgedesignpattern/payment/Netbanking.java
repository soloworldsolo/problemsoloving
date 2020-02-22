package com.solo.designpatterns.bridgedesignpattern.payment;

public class Netbanking implements Payment {

  @Override
  public void pay() {
    System.out.println("payment done via netbanking");
  }
}
