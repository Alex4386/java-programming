package me.alex4386.gachon.sw14462.day20.ex10_1c;

public class Main {
    public static void main(String[] args) {
        PayCalculator regularPay = new RegularPay(10);
        PayCalculator hazardPay = new HazardPay(10);

        System.out.println("Regular Pay: " + regularPay.computePay(10));
        System.out.println("Hazard Pay: " + hazardPay.computePay(10));
    }
}
