package in.gangwar;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class orderService {

    paymentService payment ;



    public orderService(@Lazy paymentService payment) {

        this.payment = payment ;

        System.out.println("order service created");
    }


    public void placeOrder(){
        payment.pay();

        System.out.println("Order placed ");
    }
}
