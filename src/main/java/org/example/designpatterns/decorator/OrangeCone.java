package org.example.designpatterns.decorator;

public class OrangeCone implements IceCream {

    OrangeCone() { }
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
