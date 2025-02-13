package karpo.designpatternsdemo.service.payment;

import org.springframework.stereotype.Component;

@Component("payPalPayment")
public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + "via PayPal");
    }
}
