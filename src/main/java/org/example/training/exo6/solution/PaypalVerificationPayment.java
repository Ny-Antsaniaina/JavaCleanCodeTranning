package org.example.training.exo6.solution;

import java.util.logging.Logger;

public class PaypalVerificationPayment implements OrderFactory {

    private final Logger logger = Logger.getLogger(PaypalVerificationPayment.class.getName());

    @Override
    public void OrderProcess(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount < 0");
        }
        logger.info("Paypal verification payment processed" + amount);
    }
}
