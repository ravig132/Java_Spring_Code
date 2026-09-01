package org.example.notification;

public class popUpNotificationService implements notificationService{

    @Override
    public void sendNotification() {
        System.out.println("Popup notification send");
    }
}
