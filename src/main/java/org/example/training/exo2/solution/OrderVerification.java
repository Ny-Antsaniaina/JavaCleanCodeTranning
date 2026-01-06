package org.example.training.exo2.solution;

public class OrderVerification {

    public void verifyOrder(Order order) {
        verificationProductName(order.getProductName());
        verificationPriceAndQuantityOfVipOrNormal(order.getUserType(),order.getPrice(),order.getQuantity());
        System.out.println("Order verification completed");
    }

    public void verificationProductName(String productName) {
        if (productName == null && productName.equals("")) {
            throw new IllegalArgumentException("Product name is empty");
        }
        System.out.println("Product name is " + productName);
    }

    public void verificationPriceAndQuantityOfVipOrNormal(String userType , double price , int quantity) {
        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Price and quantity are negative");
        }else if (userType.equals("NORMAL") || userType.equals("VIP")) {
            double total = price * quantity;
            if (userType.equals("VIP")) {
                total = total - (total * 0.2);
            }
        }else {
           throw  new IllegalArgumentException("Invalid user type");
        }
    }
}
