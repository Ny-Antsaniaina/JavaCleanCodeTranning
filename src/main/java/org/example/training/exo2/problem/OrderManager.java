package org.example.training.exo2.problem;

public class OrderManager {

    public void processOrder(String productName, int quantity, double price, String userType) {

        if (productName != null && !productName.equals("")
                && quantity > 0
                && price > 0
                && (userType.equals("VIP") || userType.equals("NORMAL"))) {

            double total = quantity * price;

            if (userType.equals("VIP")) {
                total = total - (total * 0.2);
            }

            System.out.println("Order for " + productName + " total = " + total);

        } else {
            System.out.println("Invalid order");
        }
    }
}
