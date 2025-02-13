package karpo.designpatternsdemo.service;

import karpo.designpatternsdemo.service.notification.Observer;

public interface UserService {
    public void registerObserver(Observer observer);

    public void notifyObservers(String event);

    public void registerUser(String username);

}
