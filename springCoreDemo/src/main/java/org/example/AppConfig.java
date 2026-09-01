package org.example;

import org.example.payment.cardPayment;
import org.example.payment.paymentService;
import org.example.payment.upiPayment;
import org.gangwar.cartService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
    @Bean
    public user createUser(){
        return new user(420,"Anu");
    }

    @Bean
    @Qualifier
    public cartService createCartService(){
        return new cartService();
    }

    @Bean
    @Qualifier
    public paymentService createCardPayment(){
        return new cardPayment();
    }

    @Bean
    @Qualifier
    public paymentService createUPIPayment(){
        return new upiPayment();
    }

    @Bean
    public orderService createOrderService(@Qualifier("createUPIPayment") paymentService payment){
        return new orderService(payment);
    }

}
