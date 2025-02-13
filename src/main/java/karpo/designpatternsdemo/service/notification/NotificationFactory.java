package karpo.designpatternsdemo.service.notification;

import karpo.designpatternsdemo.service.notification.impl.EmailNotification;
import karpo.designpatternsdemo.service.notification.impl.SMSNotification;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        switch (type.toUpperCase()) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            default:
                throw new IllegalArgumentException("Invalid notification type: " + type);
        }
    }
}
