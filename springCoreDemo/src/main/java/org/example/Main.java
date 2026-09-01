package org.example;

import org.gangwar.cartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        orderService order = context.getBean(orderService.class);
        order.placeOrder();

//        cartService cart = context.getBean(cartService.class);
//        cart.addToCart();
//
//        user User = context.getBean(user.class);
//        System.out.println(User.getName());



    }
}