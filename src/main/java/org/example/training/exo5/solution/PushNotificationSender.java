package org.example.training.exo5.solution;

import java.util.logging.Logger;

public class PushNotificationSender implements NotificationSender {

    private static final Logger logger =
            Logger.getLogger(PushNotificationSender.class.getName());

    @Override
    public void send(String message) {
        logger.info("Sending PUSH: " + message);
    }
}
