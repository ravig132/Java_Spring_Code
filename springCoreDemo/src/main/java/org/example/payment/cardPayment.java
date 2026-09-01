package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class cardPayment implements paymentService{

    @Override
    public void pay() {
        System.out.println("Paying through card");
    }
}
