package com.solo.designpatterns.bridgedesignpattern.bank;

import com.solo.designpatterns.bridgedesignpattern.payment.Payment;

public class ICICIBank extends Bank{

    @Override
   public void pay() {
        payment.pay ();
    }

    public ICICIBank(Payment payment) {
        super (payment);
    }
}
