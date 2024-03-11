package me.alex4386.gachon.sw14462.day03;

public class EggBasket {
    // At the beginning of the section enclosed by curly braces `{}`
    public static void main(String[] args) {
        // A variable must be declared before it is used
        int numberOfBaskets, eggsPerBasket, totalEggs; // variable declaration

        numberOfBaskets = 20; // assignment statement
        eggsPerBasket = 18;

        totalEggs = numberOfBaskets * eggsPerBasket;

        System.out.println("If you have");
        System.out.println(eggsPerBasket + " eggs per basket and");
        System.out.println(numberOfBaskets + " baskets, then");
        System.out.println("the total number of eggs is " + totalEggs);
    }
}
