package org.example.concurrency.addersubtractorsyncmethod;

public class Subtractor implements Runnable {
    Count count;

    Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
//            count.value -= i;
            System.out.println("Subtracting: "+i);
            count.addValue(-1);
        }
    }
}
