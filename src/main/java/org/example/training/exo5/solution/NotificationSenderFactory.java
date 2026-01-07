package org.example.training.exo5.solution;

public class NotificationSenderFactory {

    public NotificationSender getSender(TypeNotification type) {
        return switch (type) {
            case EMAIL -> new EmailNotificationSender();
            case SMS -> new SmsNotificationSender();
            case PUSH -> new PushNotificationSender();
        };
    }
}
