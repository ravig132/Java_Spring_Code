package org.example;

import org.example.notification.emailService;
import org.example.notification.notificationService;
import org.example.notification.orderService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        notificationService notification = new emailService() ;

        orderService order = new orderService();

        order.setNotify(notification) ;


        order.placeOrder();
    }
}