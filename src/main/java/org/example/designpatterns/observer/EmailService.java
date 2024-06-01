package org.example.designpatterns.observer;

public class EmailService implements OnOrderPlacedSubscriber{

    public EmailService() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void orderPlacedEvent() {
        System.out.println("Sending Email...");
    }
}
