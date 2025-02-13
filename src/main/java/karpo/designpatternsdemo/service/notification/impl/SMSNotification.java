package karpo.designpatternsdemo.service.notification.impl;

import karpo.designpatternsdemo.service.notification.Notification;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
