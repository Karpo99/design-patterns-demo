package karpo.designpatternsdemo.service.payment;

import org.springframework.stereotype.Component;

@Component("creditCardPayment")
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $ " + amount + "with credit card");
    }
}
