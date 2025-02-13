package karpo.designpatternsdemo.controller;

import java.util.List;
import karpo.designpatternsdemo.service.UserService;
import karpo.designpatternsdemo.service.notification.Observer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService, List<Observer> observers) {
        this.userService = userService;
        observers.forEach(userService::registerObserver);
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestParam String username) {
        userService.registerUser(username);
        return ResponseEntity.ok("User registered successfully, notification sent!");
    }
}
