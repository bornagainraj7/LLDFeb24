package org.example.designpatterns.strategy;

public class CarPathCalculator implements PathCalculatorStrategy {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Car Path");
    }
}
