package karpo.designpatternsdemo.service.notification.impl;

import karpo.designpatternsdemo.service.notification.Observer;
import org.springframework.stereotype.Component;

@Component
public class EmailObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Email sent for event " + event);
    }
}
