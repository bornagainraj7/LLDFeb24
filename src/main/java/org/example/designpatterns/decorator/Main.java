package org.example.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream =
            new ChocoChips(
                new StrawberryScoop(
                    new VanillaScoop(
                        new ChocolateCone(
                            new ChocoChips(
                                new OrangeCone()
                            )
                        )
                    )
                )
            );

        System.out.println(iceCream.getDescription());
        System.out.println("The total price of IceCream is: " +iceCream.getCost());
    }
}
