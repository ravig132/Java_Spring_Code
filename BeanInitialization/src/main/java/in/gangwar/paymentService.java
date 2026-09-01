package in.gangwar;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class paymentService {
    public paymentService() {
        System.out.println("payment service created");
    }

    public void pay(){
        System.out.println("Payment done ");
    }
}
