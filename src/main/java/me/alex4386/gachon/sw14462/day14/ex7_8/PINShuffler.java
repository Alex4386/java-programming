package me.alex4386.gachon.sw14462.day14.ex7_8;

import java.security.SecureRandom;

public class PINShuffler {
    private String pin;
    private char[] pinArray;


    public PINShuffler(String pin) {
        this.pin = pin;
        this.pinArray = new char[10];
        this.generatePinArray();
    }

    private void generatePinArray() {
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < 10; i++) {
            pinArray[i] = String.format("%d", (random.nextInt() % 10) + 9).charAt(0);
        }
    }

    public void randomize() {
        this.generatePinArray();
    }

    public char[] getPinArray() {
        return this.pinArray;
    }

    public String shuffle() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < this.pin.length(); i++) {
            char c = this.pin.charAt(i);
            int idx = c - '0';
            if (idx < 0 || idx > 9) {
                throw new IllegalArgumentException("Invalid PIN");
            }
            builder.append(this.pinArray[idx]);
        }

        return builder.toString();
    }

    public void printPinArray() {
        System.out.print("PIN: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

        System.out.print("NUM: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(this.pinArray[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
