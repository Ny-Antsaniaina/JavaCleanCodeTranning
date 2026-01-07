package org.example.training.exo6.solution;

public class OrderService {
    private final OrderProcesserFactory orderProcesserFactory;
    public OrderService(OrderProcesserFactory orderProcesserFactory) {
        this.orderProcesserFactory = orderProcesserFactory;
    }
    public void process(Order order) {
        OrderFactory orderFactory = orderProcesserFactory.orderProcess(order.getPaymentType());
        orderFactory.OrderProcess(order.getAmount());
    }
}
