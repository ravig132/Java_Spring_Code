package in.gangwar.SpringApp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {


    private PaymentProperties paymentProperties ;
//    @Value("${paymentGateway.type:Paytm}")
//    private String type ;
//    @Value("${paymentGateway.retryCount}")
//    private int retryCount ;


//    public PaymentGateway( int retryCount, String type) {
//        this.retryCount = retryCount;
//        this.type = type;
//    }


    public PaymentGateway(PaymentProperties paymentProperties){
        this.paymentProperties = paymentProperties ;
    }

    public String getType(){
        return paymentProperties.getType();
    }

    public int getRetryCount(){
        return paymentProperties.getRetryCount();
    }

    public boolean isEnabled(){
        return paymentProperties.isEnabled();
    }

    public int timeout(){
        return paymentProperties.getTimeout();
    }


    public void print(){
        System.out.println(getType());
        System.out.println(getRetryCount());
        System.out.println(isEnabled());
        System.out.println(timeout());
    }
}
