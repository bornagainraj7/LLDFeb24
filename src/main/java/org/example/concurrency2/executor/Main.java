package org.example.concurrency2.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        NumberPrinter printer = null;
//        Thread t = null;

        ExecutorService executor = Executors.newFixedThreadPool(10);


        for (int i = 1; i <= 100; i++) {
            if (i == 5 || i == 10 || i == 95) {
                System.out.println("DEBUG");
            }
            printer = new NumberPrinter(i);
//            t = new Thread(printer);
//            t.start();
            executor.submit(printer);
        }

        executor.shutdown(); // executor service needs to be shutdown just like a factory in real

    }
}
