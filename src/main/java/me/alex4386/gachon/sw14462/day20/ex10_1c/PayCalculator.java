package me.alex4386.gachon.sw14462.day20.ex10_1c;

public abstract class PayCalculator {
    protected double payRate;

    public double computePay(double hours) {
        return this.payRate * hours;
    }

}
