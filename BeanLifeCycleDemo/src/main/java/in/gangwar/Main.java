package in.gangwar;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        orderService order = context.getBean(orderService.class);
//        order.placeOrder();

//        CartService cart = context.getBean(CartService.class);
//        cart.addToCart();
//        System.out.println(cart.getValue(1));
//
//        context.close();





    }
}