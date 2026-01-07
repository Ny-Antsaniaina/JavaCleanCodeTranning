package org.example.training.exo3.solution;

import java.util.logging.Logger;

public class PaymentVerification {

    private final Logger logger = Logger.getLogger(PaymentVerification.class.getName());

    public void validationPayment(Payment payment) {
       verificationCardNumber(payment.getCardNumber());
       verificationCVV(payment.getCvv());
       verificationAmount(payment.getAmount());
       logger.info("Payment verification completed");
    }

    public void verificationCardNumber(String cardNumber) {
        if (cardNumber != null && cardNumber.length() == 16) {
            if (cardNumber.startsWith("4")){
                logger.info("Card number is valid");
            }
            logger.info("Card number" + cardNumber + " verified");
        }else {
            throw new RuntimeException("Invalid card number");
        }
    }

    public void verificationCVV(String cvv) {
        if (cvv != null && cvv.length() == 3) {
            System.out.println("CVV " + cvv + " is valid");
        }else {
            throw new IllegalArgumentException("Error: CVV is invalid");
        }
    }

    public void verificationAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount is negative");
        }else {
            System.out.println("Amount " + amount + " is valid");
        }
    }
}
