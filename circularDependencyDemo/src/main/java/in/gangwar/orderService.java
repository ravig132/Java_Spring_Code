package in.gangwar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class orderService {

    @Autowired
    private paymentService payment ;

//    orderService (paymentService payment){
//        this.payment = payment ;
//    }

    public void placeOrder(){

        payment.pay();

        System.out.println("Order placed");
    }

    public void getOrderDetails(){
        System.out.println("Order Details");
    }

}
