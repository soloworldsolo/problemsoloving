package com.solo.designpatterns.bridgedesignpattern.payment;

public class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println ("paying done via credit card" );
    }
}
