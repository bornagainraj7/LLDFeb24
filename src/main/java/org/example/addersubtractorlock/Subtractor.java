package org.example.addersubtractorlock;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    Count count;
    Lock lock;

    Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for (int i = 1; i <= 100000; i++) {
            count.value -= 1;
//            System.out.println("Subtracting: "+ count.value);
        }
        lock.unlock();
    }
}
