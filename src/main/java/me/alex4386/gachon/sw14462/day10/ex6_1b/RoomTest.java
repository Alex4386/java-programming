package me.alex4386.gachon.sw14462.day10.ex6_1b;

public class RoomTest {
    public static void main(String[] args) {
        RoomOccupancy room1 = new RoomOccupancy(101, 0);
        RoomOccupancy room2 = new RoomOccupancy(102, 0);

        System.out.println("Initial state:");
        System.out.println("Room " + room1.getNumber() + " has " + room1.getTotal() + " people.");
        System.out.println("Room " + room2.getNumber() + " has " + room2.getTotal() + " people.");

        System.out.println("Adding 1 person to room1:");
        room1.addOneToRoom();

        System.out.println("Adding 2 people to room2:");
        room2.addOneToRoom();
        room2.addOneToRoom();

        System.out.println("Expected behavior: since RoomOccupancy#getTotal() returns static variable totalPeople:");
        System.out.println("                   Both rooms should have 3 people.");

        System.out.println("Room " + room1.getNumber() + " has " + room1.getTotal() + " people.");
        System.out.println("Room " + room2.getNumber() + " has " + room2.getTotal() + " people.");

        System.out.println("Removing 1 person from each room:");
        room1.removeOneFromRoom();
        room2.removeOneFromRoom();

        System.out.println("Final state (after removing 1 person from each room):");
        System.out.println("Room " + room1.getNumber() + " has " + room1.getTotal() + " people.");
        System.out.println("Room " + room2.getNumber() + " has " + room2.getTotal() + " people.");
    }
}
