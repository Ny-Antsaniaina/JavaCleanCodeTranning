package org.example;

import org.example.training.exo1.solution.SaveUser;
import org.example.training.exo1.solution.User;
import org.example.training.exo2.solution.Order;
import org.example.training.exo2.solution.OrderService;

public class Main {
    public static void main(String[] args) {
        SaveUser saveUser = new SaveUser();
        User user = new User.Builder().name("ben").password("bena").age(19).build();

        saveUser.SaveUserIn(user);

        Order order = new Order.Builder().productName("tay")
                .price(200).quantity(1).userType("NORMAL").build();
        OrderService orderService = new OrderService();
        orderService.saveOrder(order);

    }
}