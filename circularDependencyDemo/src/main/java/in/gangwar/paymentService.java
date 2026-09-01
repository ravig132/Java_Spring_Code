package in.gangwar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class paymentService {

    @Autowired
    private orderService order ;

//    paymentService(orderService order){
//        this.order = order ;
//    }

    public void pay(){

        System.out.println("Payment done");

        order.getOrderDetails();
    }

}
