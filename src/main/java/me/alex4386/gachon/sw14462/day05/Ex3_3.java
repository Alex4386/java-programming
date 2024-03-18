package me.alex4386.gachon.sw14462.day05;

import java.util.Scanner;

public class Ex3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the initial balance: ");
            int initialBalance = scanner.nextInt();

            System.out.print("Enter the annual interest rate (%): ");
            double annualInterestRate = scanner.nextDouble() / 100;

            int years = 10;
            BankCalculator calculator = new BankCalculator(initialBalance, annualInterestRate);

            System.out.println("Annual : "+calculator.annualBalance(years));
            System.out.println("Monthly: "+calculator.monthlyBalance(years * 12));
            System.out.println("Daily  : "+calculator.dailyBalance(years * 365));

            System.out.print("Do you want to calculate another balance? (yes/no): ");
            String answer = scanner.next();

            if (answer.equals("no")) {
                break;
            }
        }
    }
}
