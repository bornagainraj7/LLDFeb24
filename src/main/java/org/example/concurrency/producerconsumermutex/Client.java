package org.example.concurrency.producerconsumermutex;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Queue<Object> store = new ConcurrentLinkedQueue<>();
        int maxSize = 6;
        Producer p1 = new Producer(store, "P1", maxSize);
        Producer p2 = new Producer(store, "P2", maxSize);
        Producer p3 = new Producer(store, "P3", maxSize);
        Producer p4 = new Producer(store, "P4", maxSize);
        Producer p5 = new Producer(store, "P5", maxSize);

        Consumer c1 = new Consumer(store, "C1", maxSize);
        Consumer c2 = new Consumer(store, "C2", maxSize);
        Consumer c3 = new Consumer(store, "C3", maxSize);

        ExecutorService executors = Executors.newCachedThreadPool();
        executors.submit(p1);
        executors.submit(p2);
        executors.submit(p3);
        executors.submit(p4);
        executors.submit(p5);

        executors.submit(c1);
        executors.submit(c2);
        executors.submit(c3);


    }
}
