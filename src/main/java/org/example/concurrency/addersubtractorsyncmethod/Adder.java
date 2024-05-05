package org.example.concurrency.addersubtractorsyncmethod;

public class Adder implements Runnable {
    Count count;

    Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
//            count.value += 1;
            System.out.println("Adding : "+ i);
            count.addValue(1);
        }
    }
}
