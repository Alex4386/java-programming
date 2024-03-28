package me.alex4386.gachon.sw14462.day08.ex4_1;

public class MotorBoatTest {
    public static void main(String[] args) {
        MotorBoat boat = new MotorBoat();

        // provision boat instance - since I can not use constructor "yet"
        boat.tankCapacity = 100;
        boat.fuelInTank = 50;
        boat.maximumSpeed = 100;
        boat.currentSpeed = 50;
        boat.fuelEfficiency = 0.1;

        // test section
        boat.printFuelUsage(10);
        System.out.println("Travelled distance: "+boat.getTravelledDistance(10));
        System.out.println("Available distance: "+boat.getAvailableDistance());
    }
}
