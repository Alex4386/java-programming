package me.alex4386.gachon.sw14462.day10.ex6_1b;

public class RoomOccupancy {
    private int roomNumber;
    private int peopleInRoom;
    private static int totalPeople = 0;

    public RoomOccupancy(int roomNumber, int peopleInRoom) {
        this.roomNumber = roomNumber;
        this.peopleInRoom = peopleInRoom;
    }

    public void addOneToRoom() {
        this.peopleInRoom++;
        totalPeople++;
    }

    public void removeOneFromRoom() {
        if (this.peopleInRoom > 0 && totalPeople > 0) {
            this.peopleInRoom--;
            totalPeople--;
        }
    }

    public int getNumber() {
        return this.roomNumber;
    }

    public static int getTotal() {
        return totalPeople;
    }
}
