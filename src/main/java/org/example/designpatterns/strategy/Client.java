package org.example.designpatterns.strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps maps = new GoogleMaps();
        maps.findPath("Mumbai", "Pune", "bike");
    }
}
