package karpo.designpatternsdemo.service.notification.impl;

import karpo.designpatternsdemo.service.notification.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
