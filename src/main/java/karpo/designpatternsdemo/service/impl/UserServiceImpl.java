package karpo.designpatternsdemo.service.impl;

import java.util.ArrayList;
import java.util.List;
import karpo.designpatternsdemo.service.UserService;
import karpo.designpatternsdemo.service.notification.Observer;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    @Override
    public void registerUser(String username) {
        System.out.println("User registered: " + username);
        notifyObservers("User Registration");
    }
}
