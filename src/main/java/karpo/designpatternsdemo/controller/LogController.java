package karpo.designpatternsdemo.controller;

import karpo.designpatternsdemo.service.LoggerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @GetMapping("/log")
    public ResponseEntity<String> logMessage() {
        // Accessing the Singleton instance of LoggerService()
        LoggerService logger = LoggerService.getInstance();

        logger.log("This is a log message");

        return ResponseEntity.ok("Message logged successfully");
    }
}
