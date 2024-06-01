package org.example.designpatterns.strategy;

public class BikePathCalculator implements PathCalculatorStrategy {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Bike path");
    }
}
