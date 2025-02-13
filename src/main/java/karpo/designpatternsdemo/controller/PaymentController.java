package karpo.designpatternsdemo.controller;

import karpo.designpatternsdemo.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping("/pay")
    public ResponseEntity<String> processPayment(@RequestParam double amount) {
        paymentService.processPayment(amount);
        return ResponseEntity.ok("Payment processed");
    }
}

