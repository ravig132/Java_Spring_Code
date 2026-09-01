package in.gangwar;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public orderService getOrderService(){
        return new orderService() ;
    }

//    @Bean
//    public orderService getOrderService2(){
//        return new orderService() ;
//    }



}
