package org.example.concurrency2.printer;

public class NumberPrinter implements Runnable {
    private int number;

    public NumberPrinter(int num) {
        this.number = num;
    }
    @Override
    public void run() {
        System.out.println(number + " printed by " + Thread.currentThread().getName());
    }
}
