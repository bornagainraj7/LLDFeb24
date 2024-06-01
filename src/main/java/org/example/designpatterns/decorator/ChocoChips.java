package org.example.designpatterns.decorator;

public class ChocoChips implements IceCream {
    IceCream iceCream;

    ChocoChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + ChocoChips";
    }
}
