package com.solo.designpatterns.bridgedesignpattern.bank;

import com.solo.designpatterns.bridgedesignpattern.payment.Payment;

public class HdfcBank extends Bank {
    @Override
   public void pay() {
        payment.pay ();
    }

    public HdfcBank(Payment payment) {
        super (payment);
    }
}
