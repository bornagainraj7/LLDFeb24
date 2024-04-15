package org.example.concurrency.concurrency2.printer;

public class Main {
    public static void main(String[] args) {
        NumberPrinter printer = null;
        Thread t = null;

        for (int i = 0; i <= 10; i++) {
            printer = new NumberPrinter(i);
            t = new Thread(printer);
            t.start();
        }
    }
}
