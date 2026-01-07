package org.example.training.exo5.problem;

import org.example.training.exo5.solution.Notification;
import org.example.training.exo5.solution.NotificationSenderFactory;

public class NotificationService {

    private final NotificationSenderFactory factory;

    public NotificationService(NotificationSenderFactory factory) {
        this.factory = factory;
    }

    public void notify(Notification notification) {
        factory.getSender(notification.getType())
                .send(notification.getMessage());
    }
}
