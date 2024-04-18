package me.alex4386.gachon.sw14462.day14.ex7_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pin = "182655";

        System.out.println("=== Test 1 ===");
        tryTest(scanner, pin);

        pin = "273612";
        System.out.println("=== Test 2 ===");
        tryTest(scanner, pin);

        pin = "123456";
        System.out.println("=== Test 3 ===");
        tryTest(scanner, pin);
    }

    private static void tryTest(Scanner scanner, String pin) {
        System.out.println("Target PIN: " + pin);

        PINShuffler shuffler = new PINShuffler(pin);
        shuffler.printPinArray();

        System.out.print("Enter the shuffled PIN: ");
        String validatePin = scanner.nextLine();

        if (validatePin.equals(shuffler.shuffle())) {
            System.out.println("Correct PIN!");
        } else {
            System.out.println("Incorrect PIN!");
        }
    }
}
