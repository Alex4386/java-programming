package me.alex4386.gachon.sw14462.day03;

import me.alex4386.gachon.sw14462.day03.coins.CoinImpl;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 2_1a. Read a four-digit integer and display one digit per line");
        Main.exercise2_1a();

        System.out.println("");
        System.out.println("Exercise 2_1b. Convert Fahrenheit to Celsius");
        Main.exercise2_1b();

        System.out.println("");
        System.out.println("Exercise 2_2. Move first word to the end of the sentence");
        Main.exercise2_2();

        System.out.println("");
        System.out.println("Exercise 2_3. Get charge coins using Greedy Algorithm");
        Main.exercise2_3();
    }

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static void exercise2_1a() {
        Scanner scanner = Main.getScanner();

        System.out.print("Enter a four-digit integer: ");
        int integer = scanner.nextInt();

        DigitParser parser = new DigitParser(integer);
        while (true) {
            int digit = parser.nextDigit();
            if (digit == -1) {
                break;
            }
            System.out.println(digit);
        }
    }

    public static void exercise2_1b() {
        Scanner scanner = Main.getScanner();

        System.out.print("Enter a temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = FahrenheitConverter.toCelsius(fahrenheit);
        System.out.printf("The temperature in Celsius is %.02f°C.\n", celsius);
    }

    public static void exercise2_2() {
        Scanner scanner = Main.getScanner();

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String updatedSentence = WordShuffler.moveFirstWordToLast(sentence);
        System.out.println(updatedSentence);
    }

    public static void exercise2_3() {
        Scanner scanner = Main.getScanner();

        System.out.print("Enter the price (in cents): ");
        int price = scanner.nextInt();
        if (price > 100 || price < 25) {
            System.err.println("InvalidPrice: 25 <= price <= 100");
            return;
        }
        int charge = 100 - price;

        try {
            CoinPayment chargePayment = new CoinPayment(charge);
            List<CoinImpl> paidCoins = chargePayment.pay();

            System.out.println("Charge coins:");
            for (CoinImpl coin : CoinPayment.coins) {
                int count = 0;
                for (CoinImpl paidCoin : paidCoins) {
                    if (paidCoin.getClass().equals(coin.getClass())) {
                        count++;
                    }
                }
                System.out.println(coin.toString() + ": " + count);
            }

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
