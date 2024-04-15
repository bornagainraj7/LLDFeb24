package org.example.concurrency.producerconsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object> store = new ConcurrentLinkedQueue<>();
        int maxSize = 10;
        Semaphore prodSemaphore = new Semaphore(maxSize);
        Semaphore conSemaphore = new Semaphore(0);
        Producer p1 = new Producer(store, "P1", maxSize, prodSemaphore, conSemaphore);
        Producer p2 = new Producer(store, "P2", maxSize, prodSemaphore, conSemaphore);
        Producer p3 = new Producer(store, "P3", maxSize, prodSemaphore, conSemaphore);
        Producer p4 = new Producer(store, "P3", maxSize, prodSemaphore, conSemaphore);
        Producer p5 = new Producer(store, "P3", maxSize, prodSemaphore, conSemaphore);

        Consumer c1 = new Consumer(store, "C1", maxSize, prodSemaphore, conSemaphore);
        Consumer c2 = new Consumer(store, "C2", maxSize, prodSemaphore, conSemaphore);
        Consumer c3 = new Consumer(store, "C3", maxSize, prodSemaphore, conSemaphore);
        Consumer c4 = new Consumer(store, "C3", maxSize, prodSemaphore, conSemaphore);
        Consumer c5 = new Consumer(store, "C3", maxSize, prodSemaphore, conSemaphore);

//        ExecutorService executors = Executors.newCachedThreadPool();
//        executors.submit(p1);
//        executors.submit(p2);
//        executors.submit(p3);
//        executors.submit(p4);
//        executors.submit(p5);
//
//        executors.submit(c1);
//        executors.submit(c2);
//        executors.submit(c3);

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();
        Thread t4 = new Thread(p4);
        t4.start();
        Thread t5 = new Thread(p5);
        t5.start();

        Thread t6 = new Thread(c1);
        t6.start();
        Thread t7 = new Thread(c2);
        t7.start();
        Thread t8 = new Thread(c3);
        t8.start();
        Thread t9 = new Thread(c2);
        t9.start();
        Thread t10 = new Thread(c3);
        t10.start();
    }
}
