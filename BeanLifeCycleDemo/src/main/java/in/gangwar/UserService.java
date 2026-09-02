package in.gangwar;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

public class UserService implements BeanNameAware {

    public UserService() {
        System.out.println("user service constructor called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is "+name);
    }
}
