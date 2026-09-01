package org.example;

import org.example.payment.paymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class orderService {

    paymentService payment ;




    public orderService( paymentService payment) {
        this.payment = payment;
    }

    public void placeOrder(){

        payment.pay();
        System.out.println("Order placed");
    }


//    @Autowired
//    public void setPayment(paymentService payment) {
//        this.payment = payment;
//    }
}
