package me.alex4386.gachon.sw14462.day11.ex6_2a;

public enum Suit {
    CLUBS("black"), DIAMONDS("red"),  HEARTS("red"), SPADES("black");

    private final String color;

    private Suit(String suitColor) {
        this.color = suitColor;
    }

    public String getColor() {
        return this.color;
    }
}
