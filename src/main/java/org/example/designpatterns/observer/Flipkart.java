package org.example.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance = null;

    private List<OnOrderPlacedSubscriber> onOrderPlacedSubscribers = new ArrayList<>();

    private Flipkart() {}

    public static Flipkart getInstance() {
        if (instance == null) {
            instance = new Flipkart();
        }
        return instance;
    }

    public void registerSubscriber(OnOrderPlacedSubscriber subscriber) {
        onOrderPlacedSubscribers.add(subscriber);
    }

    public void unregisterSubscriber(OnOrderPlacedSubscriber subscriber) {
        onOrderPlacedSubscribers.remove(subscriber);
    }

    public void onOrderPlaced() {
        for (OnOrderPlacedSubscriber subscriber: onOrderPlacedSubscribers) {
            subscriber.orderPlacedEvent();
        }

    }

}
