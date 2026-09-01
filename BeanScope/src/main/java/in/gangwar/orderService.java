package in.gangwar;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope("singleton")
public class orderService {

    public orderService(){
        System.out.println("Order service created ");
    }

    public void placeOrder(){
        System.out.println("Order placed");
    }
}
