package org.example.concurrency.addersubtractorlock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Count count;
    Lock lock;

    Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for (int i = 1; i <= 100000; i++) {
            count.value += 1;
//            System.out.println("Adding: "+ count.value);
        }
        lock.unlock();
    }
}
