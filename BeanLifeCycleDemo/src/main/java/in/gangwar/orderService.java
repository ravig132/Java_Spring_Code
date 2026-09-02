package in.gangwar;


import org.springframework.stereotype.Component;

//@Component
public class orderService {
    paymentService payment ;

    public orderService(paymentService payment) {
        this.payment = payment;
    }

    public void placeOrder(){
        System.out.println("order placed");


        payment.pay();
    }

}
