package org.example.concurrency.producerconsumermutex;

import java.util.Queue;

public class Producer implements Runnable {
    private Queue<Object> store;
    private String name;
    private int maxSize;

    Producer(Queue<Object> store, String name, int maxSize) {
        this.store = store;
        this.name = name;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while(true) {
            synchronized(store) {
                if (store.size() < maxSize) {
                    System.out.println("Producer: " + this.name + " is producing, store size: "+ store.size());
                    store.add(new Object());
                }
            }
        }
    }
}
