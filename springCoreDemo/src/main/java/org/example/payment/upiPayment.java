package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class upiPayment implements paymentService{
    @Override
    public void pay() {
        System.out.println("Paying through UPI");
    }
}
