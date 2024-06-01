package org.example.designpatterns.observer;

public class InvoiceService implements OnOrderPlacedSubscriber {

    public InvoiceService() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void orderPlacedEvent() {
        System.out.println("Generating Invoice...");
    }
}
