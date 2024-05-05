package org.example.concurrency.producerconsumermutex;

import java.util.Queue;

public class Consumer implements Runnable {

    private Queue<Object> store;
    private String name;
    private int maxSize;

    Consumer(Queue<Object> store, String name, int maxSize) {
        this.store = store;
        this.name = name;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while(true) {
            synchronized(store) {
                if (store.size() > 0) {
                    System.out.println("Consumer: " + this.name + " is consuming, store size: "+ (store.size() - 1));
                    store.remove();
                }
            }
        }
    }
}
