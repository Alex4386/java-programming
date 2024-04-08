package me.alex4386.gachon.sw14462.day11.ex6_2a;

public class Main {
    public static void main(String args[]) {
        Suit cardSuit = Suit.SPADES;
        System.out.println("cardSuit = Suit.SPADES");

        System.out.println("cardSuit.ordinal() = " + cardSuit.ordinal());
        System.out.println("cardSuit.equals(Suit.CLUBS) = " + cardSuit.equals(Suit.CLUBS));
        System.out.println("cardSuit.compareTo(Suit.CLUBS) = " + cardSuit.compareTo(Suit.CLUBS));

        System.out.println("Suit.valueOf(\"CLUBS\") = " + Suit.valueOf("CLUBS"));
        System.out.println("Suit.valueOf(cardSuit.toString()) = " + Suit.valueOf(cardSuit.toString()));

        System.out.println("cardSuit.getColor() = " + cardSuit.getColor());
        System.out.println("cardSuit.toString() = " + cardSuit.toString());
    }
}
