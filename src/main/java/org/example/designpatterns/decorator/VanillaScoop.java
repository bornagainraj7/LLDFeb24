package org.example.designpatterns.decorator;

public class VanillaScoop implements IceCream {
    IceCream iceCream;

    VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Vanilla Scoop";
    }
}
