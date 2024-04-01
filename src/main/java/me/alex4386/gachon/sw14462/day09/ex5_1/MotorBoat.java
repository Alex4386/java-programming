package me.alex4386.gachon.sw14462.day09.ex5_1;

public class MotorBoat {
    public static final double tankCapacity = 60.0;
    private static final double maximumSpeed = 80.0;
    private double fuelInTank;
    private double currentSpeed = 0;
    private double fuelEfficiency;

    // === GETTER & SETTER ===
    public double getFuelInTank() {
        return this.fuelInTank;
    }

    public void setFuelInTank(double fuelInTank) {
        if (fuelInTank > tankCapacity) {
            throw new IllegalArgumentException("Fuel in tank cannot exceed tank capacity");
        }

        this.fuelInTank = fuelInTank;
    }

    public double getMaximumSpeed() {
        return this.maximumSpeed;
    }

    public double getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getFuelEfficiency() {
        return this.fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }



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


    // === EQUALS ===
    public boolean equals(MotorBoat other) {
        return this.fuelInTank == other.fuelInTank &&
                this.currentSpeed == other.currentSpeed &&
                this.fuelEfficiency == other.fuelEfficiency;
    }
}
