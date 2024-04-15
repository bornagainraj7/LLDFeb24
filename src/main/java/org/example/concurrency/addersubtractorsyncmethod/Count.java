package org.example.concurrency.addersubtractorsyncmethod;

public class Count {
    private int value;

    public synchronized void addValue(int i) {
        value += i;
    }

    public int getValue() {
        return this.value;
    }
}
