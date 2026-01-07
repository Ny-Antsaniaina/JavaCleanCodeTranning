package org.example.training.exo6.solution;

import org.example.training.exo3.solution.Payment;

public class OrderProcesserFactory {
    public OrderFactory orderProcess(PaymentType paymentType) {
        return switch (paymentType) {
            case PAYPAL -> new PaypalVerificationPayment();
            case CARD -> new CardValidationPayment();
        };
    }
}
