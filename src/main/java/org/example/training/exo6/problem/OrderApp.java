package org.example.training.exo6.problem;

public class OrderApp {

    public void process(String paymentType, double amount) {

        if (amount <= 0) {
            throw new RuntimeException("Invalid amount");
        }

        if (paymentType.equals("CARD")) {
            System.out.println("Paying by CARD: " + amount);
        } else if (paymentType.equals("PAYPAL")) {
            System.out.println("Paying by PAYPAL: " + amount);
        } else {
            throw new RuntimeException("Unknown payment");
        }
    }
}
