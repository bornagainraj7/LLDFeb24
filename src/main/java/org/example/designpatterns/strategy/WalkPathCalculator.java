package org.example.designpatterns.strategy;

public class WalkPathCalculator implements PathCalculatorStrategy {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Walk Path");
    }
}
