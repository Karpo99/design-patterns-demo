package karpo.designpatternsdemo.service;

import karpo.designpatternsdemo.service.payment.PaymentStrategy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentStrategy paymentStrategy;

    public PaymentService(@Qualifier("payPalPayment") PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
