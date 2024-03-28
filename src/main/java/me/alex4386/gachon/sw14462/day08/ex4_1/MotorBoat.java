package me.alex4386.gachon.sw14462.day08.ex4_1;

public class MotorBoat {
    public double tankCapacity;
    public double fuelInTank;
    public double maximumSpeed;
    public double currentSpeed = 0;
    public double fuelEfficiency;

    public void printFuelUsage(double t) {
        System.out.println("Maximum speed fuel usage: "+this.getFuelUsage(t, this.maximumSpeed));
        System.out.println("Current speed fuel usage: "+this.getFuelUsage(t));
    }

    public double getFuelUsage(double time) {
        return this.getFuelUsage(time, this.currentSpeed);
    }

    public double getFuelUsage(double time, double speed) {
        return this.fuelEfficiency * Math.pow(speed, 2) * time;
    }

    public double getTravelledDistance(double time) {
        return this.currentSpeed * time;
    }

    public double getAvailableDistance() {
        return this.fuelInTank / (this.fuelEfficiency * this.currentSpeed);
    }



}
