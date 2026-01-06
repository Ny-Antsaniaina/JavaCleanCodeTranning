package org.example.training.exo2.solution;

public class OrderService {
    private final OrderVerification orderVerification = new OrderVerification();
    public OrderService() {
    }

    public void saveOrder(Order order) {
        orderVerification.verifyOrder(order);
    }
}
