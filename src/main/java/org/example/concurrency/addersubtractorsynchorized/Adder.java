package org.example.concurrency.addersubtractorsynchorized;

public class Adder implements Runnable {
    Count count;

    Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100000; i++) {
            synchronized (count) {
                count.value += 1;
            }
//            System.out.println("Adding: "+ count.value);
        }
    }
}
