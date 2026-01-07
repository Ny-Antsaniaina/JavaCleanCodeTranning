package org.example.training.exo3.solution;

public class PaymentService {
    private final PaymentVerification paymentVerification;
    public PaymentService(PaymentVerification paymentVerification) {
        this.paymentVerification = paymentVerification;
    }
    public boolean savePayment(Payment payment) {
        paymentVerification.validationPayment(payment);
        return true;
    }
}
