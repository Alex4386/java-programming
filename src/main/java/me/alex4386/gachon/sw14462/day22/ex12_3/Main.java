package me.alex4386.gachon.sw14462.day22.ex12_3;

public class Main {
    public static void main(String[] args) {
        GoldenRatioCalculator calc = new GoldenRatioCalculator();
        for (int i = 0; i < 5; i++) {
            calc.next();
            calc.printFibonacciCalculationStatus();
        }
    }
}
