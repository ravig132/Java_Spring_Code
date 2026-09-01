package in.gangwar;


import org.springframework.stereotype.Component;

@Component
public class A {

    orderService order;

    public A (orderService order){
        this.order = order ;
    }

}
