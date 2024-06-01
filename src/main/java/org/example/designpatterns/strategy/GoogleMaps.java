package org.example.designpatterns.strategy;

public class GoogleMaps {
    public void findPath(String src, String dest, String mode) {
        PathCalculatorStrategy pathCalculatorStrategy =
                PathCalculatorFactory.getPathCalculatorMode(mode);

        pathCalculatorStrategy.findPath(src, dest);
    }
}
