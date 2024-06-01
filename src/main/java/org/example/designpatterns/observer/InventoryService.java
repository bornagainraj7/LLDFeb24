package org.example.designpatterns.observer;

public class InventoryService implements OnOrderPlacedSubscriber{

    public InventoryService() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }


    @Override
    public void orderPlacedEvent() {
        System.out.println("Updating Inventory...");
    }
}
