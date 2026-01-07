package org.example.training.exo5.solution;

import java.util.logging.Logger;

public class SmsNotificationSender implements NotificationSender {

    private static final Logger logger =
            Logger.getLogger(SmsNotificationSender.class.getName());

    @Override
    public void send(String message) {
        logger.info("Sending SMS: " + message);
    }
}
