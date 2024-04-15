package org.example.concurrency.addersubtractorsyncmethod;

public class Adder implements Runnable {
    Count count;

    Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100000; i++) {
//            count.value += 1;
            count.addValue(1);
        }
    }
}
