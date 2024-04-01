package me.alex4386.gachon.sw14462.day09.ex5_1;
public class MotorBoatTest {
    public static void main(String[] args) {
        MotorBoat boat1 = new MotorBoat();
        boat1.setFuelInTank(50);
        boat1.setCurrentSpeed(50);
        boat1.setFuelEfficiency(0.1);

        MotorBoat boat2 = new MotorBoat();
        boat2.setFuelInTank(50);
        boat2.setCurrentSpeed(50);
        boat2.setFuelEfficiency(0.1);

        MotorBoat boat3 = new MotorBoat();
        boat3.setFuelInTank(50);
        boat3.setCurrentSpeed(30);
        boat3.setFuelEfficiency(0.2);

        System.out.println("Boat 1: ");
        System.out.println("Fuel in tank: "+boat1.getFuelInTank());
        System.out.println("Maximum speed: "+boat1.getMaximumSpeed());
        System.out.println("Current speed: "+boat1.getCurrentSpeed());
        System.out.println("Fuel efficiency: "+boat1.getFuelEfficiency());
        System.out.println("");
        System.out.println("Boat 2:");
        System.out.println("Fuel in tank: "+boat2.getFuelInTank());
        System.out.println("Maximum speed: "+boat2.getMaximumSpeed());
        System.out.println("Current speed: "+boat2.getCurrentSpeed());
        System.out.println("Fuel efficiency: "+boat2.getFuelEfficiency());
        System.out.println("");
        System.out.println("Boat 3:");
        System.out.println("Fuel in tank: "+boat3.getFuelInTank());
        System.out.println("Maximum speed: "+boat3.getMaximumSpeed());
        System.out.println("Current speed: "+boat3.getCurrentSpeed());
        System.out.println("Fuel efficiency: "+boat3.getFuelEfficiency());

        System.out.println("");
        System.out.println("Is Boat 1 and Boat 2 equal? "+(boat1.equals(boat2) ? "Yes" : "No"));
        System.out.println("Is Boat 1 and Boat 3 equal? "+(boat1.equals(boat3) ? "Yes" : "No"));
    }
}
