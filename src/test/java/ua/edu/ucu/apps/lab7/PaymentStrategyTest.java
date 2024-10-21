package ua.edu.ucu.apps.lab7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.lab7.store.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.lab7.store.payment.PayPalPaymentStrategy;

class PaymentStrategyTest {
    private CreditCardPaymentStrategy creditCardPayment;
    private PayPalPaymentStrategy payPalPayment;

    @BeforeEach
    void setUp() {
        creditCardPayment = new CreditCardPaymentStrategy();
        payPalPayment = new PayPalPaymentStrategy();
    }

    @Test
    void testCreditCardPayment() {
        double price = 1000;
        double result = creditCardPayment.pay(price);
        assertEquals(1010, result);
    }

    @Test
    void testPayPalPayment() {
        double price = 1000;
        double result = payPalPayment.pay(price);
        assertEquals(1005, result);
    }
}
