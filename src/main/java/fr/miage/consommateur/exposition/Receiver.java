package fr.miage.consommateur.exposition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);

    public void onMessageReceived(String message) {
        logger.info("Received [" + message + "]");
    }

}
