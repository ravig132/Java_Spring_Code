package in.gangwar;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

//@Component
public class CartService implements BeanNameAware, ApplicationContextAware
        /*, DisposableBean
         implements InitializingBean */ {

    Map<Integer,String> mp ;

    public CartService(){
        mp = new HashMap<>();
        System.out.println("Cart Service constructor called");
    }



//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Bean is ready");
//        mp.put(1,"Ravi");
//        mp.put(2,"Rohit");
//    }

    public  void start(){
        System.out.println("Bean is ready");
        mp.put(1,"Ravi");
        mp.put(2,"Rohit");
    }

    public void stop(){
        mp.clear();
        System.out.println("Bean is getting destroy");
    }

    @PostConstruct
    public void start2(){
        System.out.println("Bean is ready");
        mp.put(1,"Ravi");
        mp.put(2,"Rohit");
    }

    @PreDestroy
    public void stop2(){
        mp.clear();
        System.out.println("Bean is getting destroy");
    }




    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is "+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context name is "+applicationContext);
    }


    public void addToCart(){
        System.out.println("Added to cart");
    }

    public String getValue(int key){
        return mp.get(key) ;
    }
//
//    @Override
//    public void destroy() throws Exception {
//        mp.clear();
//        System.out.println("Bean is getting destroy");
//    }
}
