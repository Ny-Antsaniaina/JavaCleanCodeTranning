package org.example.training.exo5.solution;

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
