package org.example;

import org.example.training.exo1.solution.SaveUser;
import org.example.training.exo1.solution.User;
import org.example.training.exo2.solution.Order;
import org.example.training.exo2.solution.OrderService;
import org.example.training.exo3.solution.Payment;
import org.example.training.exo3.solution.PaymentService;
import org.example.training.exo3.solution.PaymentVerification;
import org.example.training.exo5.problem.NotificationService;
import org.example.training.exo5.solution.Notification;
import org.example.training.exo5.solution.NotificationSenderFactory;
import org.example.training.exo5.solution.TypeNotification;

public class Main {
    public static void main(String[] args) {
        SaveUser saveUser = new SaveUser();
        User user = new User.Builder().name("ben").password("bena").age(19).build();

        saveUser.SaveUserIn(user);

        Order order = new Order.Builder().productName("tay")
                .price(200).quantity(1).userType("NORMAL").build();
        OrderService orderService = new OrderService();
        orderService.saveOrder(order);
        System.out.println(" Order saved successfully " + order.getProductName());

        PaymentVerification paymentVerification = new PaymentVerification();
        PaymentService paymentService = new PaymentService(paymentVerification);

        Payment payment = new Payment.Builder().cardNumber("7894561231234567").cvv("aze").amount(54555).build();
        paymentService.savePayment(payment);

        NotificationSenderFactory factory = new NotificationSenderFactory();
        NotificationService service = new NotificationService(factory);

        Notification notification = new Notification.Builder()
                .type(TypeNotification.EMAIL)
                .message("Hello Clean Code 🚀")
                .build();

        service.notify(notification);
    }
}