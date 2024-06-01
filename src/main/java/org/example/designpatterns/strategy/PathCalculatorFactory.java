package org.example.designpatterns.strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculatorMode(String mode) {
        if (mode.equals("car")) {
            return new CarPathCalculator();
        } else if (mode.equals("bike")) {
            return new BikePathCalculator();
        } else {
            return new WalkPathCalculator();
        }
    }
}
