package org.example.training.exo6.solution;

import java.util.logging.Logger;

public class CardValidationPayment implements OrderFactory {

    private final Logger logger = Logger.getLogger(CardValidationPayment.class.getName());

    @Override
    public void OrderProcess(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        logger.info("Card payment processed" + amount);
    }
}
