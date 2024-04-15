package org.example.concurrency.producerconsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Queue<Object> store;
    private String name;
    private int maxSize;
    private Semaphore conSemaphore;
    private Semaphore prodSemaphore;

    Consumer(Queue<Object> store, String name, int maxSize, Semaphore prodSemaphore, Semaphore conSemaphore) {
        this.store = store;
        this.name = name;
        this.maxSize = maxSize;
        this.prodSemaphore = prodSemaphore;
        this.conSemaphore = conSemaphore;
    }

    @Override
    public void run() {
        while(true) {
            try {
                conSemaphore.acquire(); // conSemaphore--
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Consumer: " + this.name + " is consuming, store size: "+ store.size());
            store.remove();
            prodSemaphore.release(); // prodSemaphore++

        }

    }
}
