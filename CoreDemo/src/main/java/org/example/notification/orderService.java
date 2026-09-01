package org.example.notification;

public class orderService {

    notificationService notify;

    public orderService(){

    }

    public orderService(notificationService notify){
        this.notify = notify ;
    }

    public void setNotify(notificationService notify) {
        this.notify = notify;
    }

    public void placeOrder(){
        System.out.println("Order placed");
        notify.sendNotification();
    }

}
