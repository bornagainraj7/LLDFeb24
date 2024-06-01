package org.example.designpatterns.decorator;

public class StrawberryScoop implements IceCream{
    IceCream iceCream;

    StrawberryScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 40;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Strawberry Scoop";
    }
}
