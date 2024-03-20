package me.alex4386.gachon.sw14462.day06;

import me.alex4386.gachon.sw14462.day03.CoinPayment;
import me.alex4386.gachon.sw14462.day03.coins.CoinImpl;
import me.alex4386.gachon.sw14462.day05.Ex3_3;
import me.alex4386.gachon.sw14462.day05.Ex3_6;
import me.alex4386.gachon.sw14462.day05.Ex3_7;

import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = null;

    public static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }

        return scanner;
    }

    public static void main(String[] args) {
        System.out.println("Practice 3.1");
        System.out.println("Practice 3.1a. Write a cashing program");
        Main.exercise3_1a();
        System.out.println("");

        System.out.println("Practice 3.1b. Extend the existing get charge coins");
        Main.exercise3_1b();
        System.out.println("");

        System.out.println("Practice 3.1c. Write a letter grade converter using switch statement");
        Main.exercise3_1c();
        System.out.println("");
        System.out.println("");

        System.out.println("Practice 3.2");
        System.out.println("Practice 3.2a. Write an integer collection/statistics program");
        Main.exercise3_2a();

        System.out.println("Practice 3.2b. Extend collection/statistics program for grading");
        Main.exercise3_2b();

        System.out.println("");
        System.out.println("");

        System.out.println("Textbook Programming Project ----");
        System.out.println("Exercise 3.3. Write a program that reads a bank account balance and an interest rate and displays the value of the account in ten years.");
        System.out.println("ClassPath: "+ Ex3_3.class.getCanonicalName());
        Ex3_3.main(args);
        System.out.println("");

        System.out.println("Exercise 3.6. Write a program that asks the user to enter the size of a triangle.");
        System.out.println("ClassPath: "+ Ex3_6.class.getCanonicalName());
        Ex3_6.main(args);
        System.out.println("");

        System.out.println("Exercise 3.7. Write a program that simulates a bouncing ball by computing its height in feet at each second as time passes on a simulated clock.");
        System.out.println("ClassPath: "+ Ex3_7.class.getCanonicalName());
        Ex3_7.main(args);
        System.out.println("");
    }

    public static void exercise3_1a() {
        System.out.print("Enter the amount of check: ");
        double checkAmount = getScanner().nextDouble();

        double charge = CheckService.acceptCheck(checkAmount);
        System.out.println("The charge is $"+charge);
    }

    public static void exercise3_1b() {
        System.out.print("Enter the price (in cents): ");
        int price = getScanner().nextInt();

        if (price < 25 || price % 5 != 0 || price > 100) {
            System.err.println("Invalid input. Please enter a number between 25 and 100, divisible by 5.");
        } else {
            int payCharge = 100 - price;

            try {
                CoinPayment chargePayment = new CoinPayment(payCharge);
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

    public static void exercise3_1c() {
        System.out.print("Enter the letter based grade: ");
        char character = getScanner().next().charAt(0);

        double gradePoint = GradeConverter.letterGradeToGradePoint(character);
        System.out.println("The letter grade is "+gradePoint+".");
    }

    public static void exercise3_2a() {
        IntegerStatistics stats = new IntegerStatistics();

        while (!stats.hasFinalized()) {
            System.out.print("Enter the integer: ");
            int integer = getScanner().nextInt();

            stats.add(integer);
        }

        System.out.println("Max: "+stats.getMax());
        System.out.println("Min: "+stats.getMin());
        System.out.println("Avg: "+stats.getAverage());
    }

    public static void exercise3_2b() {
        GradeStatistics stats = new GradeStatistics();

        while (!stats.hasFinalized()) {
            System.out.print("Enter the score: ");
            int score = getScanner().nextInt();

            stats.add(score);
        }

        System.out.println("total count: "+stats.getCount());
        System.out.print("A count: "+stats.getACount()+" ");
        System.out.print("B count: "+stats.getBCount()+" ");
        System.out.print("C count: "+stats.getCCount()+" ");
        System.out.print("D count: "+stats.getDCount()+" ");
        System.out.print("F count: "+stats.getFCount()+"");
        System.out.println("");
    }
}
