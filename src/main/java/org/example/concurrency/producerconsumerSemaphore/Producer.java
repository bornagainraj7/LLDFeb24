package org.example.concurrency.producerconsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Object> store;
    private String name;
    private int maxSize;
    private Semaphore prodSemaphore;
    private Semaphore conSemaphore;

    Producer(Queue<Object> store, String name, int maxSize, Semaphore prodSemaphore, Semaphore conSemaphore) {
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
                prodSemaphore.acquire(); // prodSemaphore--
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Producer: " + this.name + " is producing, store size: "+ store.size());
            store.add(new Object());
            conSemaphore.release(); // conSemaphore++
        }
    }
}
