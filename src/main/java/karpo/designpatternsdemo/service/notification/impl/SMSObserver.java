package karpo.designpatternsdemo.service.notification.impl;

import karpo.designpatternsdemo.service.notification.Observer;
import org.springframework.stereotype.Component;

@Component
public class SMSObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("SMS sent for event: " + event);
    }
}
