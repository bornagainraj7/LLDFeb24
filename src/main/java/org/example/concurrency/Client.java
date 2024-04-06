package org.example.concurrency;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World: Thread name: "+ Thread.currentThread().getName());

        HelloWorldPrinter printer = new HelloWorldPrinter();
        Thread t1 = new Thread(printer);
        t1.start();
        Thread t2 = new Thread(printer);
        t2.start();
        Thread t3 = new Thread(printer);
        t3.start();
        Thread t4 = new Thread(printer);
        t4.start();

        System.out.println("Hello World: Thread name: "+ Thread.currentThread().getName());
        System.out.println("Hello World: Thread name: "+ Thread.currentThread().getName());

    }
}

/*
* 1. Create a Task and implement Runnable interface into that class
* 2. Create a Thread object and pass the task object inside the constructor of thread class
* 3. Start the Thread
* */