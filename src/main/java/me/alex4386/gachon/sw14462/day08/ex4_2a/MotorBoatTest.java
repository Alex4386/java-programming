package me.alex4386.gachon.sw14462.day08.ex4_2a;

public class MotorBoatTest {
    public static void main(String[] args) {
        MotorBoat boat = new MotorBoat();
        boat.setFuelInTank(50);
        boat.setCurrentSpeed(50);
        boat.setFuelEfficiency(0.1);

        boat.printFuelUsage(5);
        System.out.println("Maximum speed fuel usage: "+boat.getFuelUsage(10, boat.getMaximumSpeed()));
        System.out.println("Current speed fuel usage: "+boat.getFuelUsage(10));
        System.out.println("Travelled distance: "+boat.getTravelledDistance(10));
        System.out.println("Available distance: "+boat.getAvailableDistance());
    }
}
