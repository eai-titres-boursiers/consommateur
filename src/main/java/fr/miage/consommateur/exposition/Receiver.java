package fr.miage.consommateur.exposition;

import org.springframework.stereotype.Component;

@Component
public class Receiver {
    public void onMessageReceived(String message) {
        System.out.println("Received [" + message + "]");
    }
}
