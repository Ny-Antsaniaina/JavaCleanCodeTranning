package org.example.training.exo5.solution;

import java.util.logging.Logger;

public class EmailNotificationSender implements NotificationSender {

    private static final Logger logger =
            Logger.getLogger(EmailNotificationSender.class.getName());

    @Override
    public void send(String message) {
        logger.info("Sending EMAIL: " + message);
    }
}
