package org.example.training.exo3.problem;

public class PaymentManager {

    public boolean pay(String cardNumber, String cvv, double amount) {

        if (cardNumber != null && cardNumber.length() == 16
                && cvv != null && cvv.length() == 3
                && amount > 0) {

            if (cardNumber.startsWith("4")) {
                System.out.println("Visa payment accepted");
                return true;
            }

            System.out.println("Payment accepted");
            return true;
        }

        System.out.println("Payment failed");
        return false;
    }
}
