package org.example.designpatterns.decorator;

public class ChocolateCone implements IceCream {
    IceCream iceCream;

    ChocolateCone() { }

    ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        if (iceCream != null) {
            return iceCream.getCost() + 20;
        }
        return 0;
    }

    @Override
    public String getDescription() {
        if (iceCream != null) {
            return iceCream.getDescription() + " + Chocolate Cone";
        }
        return "Chocolate Cone";
    }
}
