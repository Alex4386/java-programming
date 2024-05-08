package me.alex4386.gachon.sw14462.day20.ex10_1c;

public class HazardPay extends PayCalculator {
    public HazardPay(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public double computePay(double hours) {
        return super.computePay(hours) * 1.5;
    }
}
