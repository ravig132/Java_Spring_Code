package in.gangwar;


import org.springframework.stereotype.Component;

@Component
public class B {

    orderService order;

    public B (orderService order){
        this.order = order ;
    }


}
