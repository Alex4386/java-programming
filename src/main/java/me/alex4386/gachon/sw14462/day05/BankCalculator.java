package me.alex4386.gachon.sw14462.day05;

public class BankCalculator {
    int balance;
    double interestRate;

    public BankCalculator(int balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public static double interestRateCalculator(int balance, double interestRate, int cycles) {
        // Perform this calculation using a loop that adds in the interest for each time period,
        // that is, do not use some sort of algebraic formula.
        //
        // :skull:

        double tmpBalance = balance;
        for (int i = 0; i < cycles; i++) {
            tmpBalance *= (1 + interestRate);
        }

        return tmpBalance;
    }

    public double annualBalance(int years) {
        // When compounded annually, the interest is added once per year at the end of the year.
        return BankCalculator.interestRateCalculator(this.balance, this.interestRate, years);
    }

    public double monthlyBalance(int months) {
        // When compounded monthly, the interest is added 12 times per year.
        return BankCalculator.interestRateCalculator(this.balance, this.interestRate / 12.0, months);
    }

    public double dailyBalance(int days) {
        // When computed daily, the interest is added 365 times per year.
        // You do not have to worry about leap years; assume that all years have 365 days.
        //
        // For annual interest, you can assume that the interest is posted exactly one year from the date of deposit.
        // In other words, you do not have to worry about interest being posted on a specific day of the year,
        // such as December 31.
        return BankCalculator.interestRateCalculator(this.balance, this.interestRate / 365.0, days);
    }
}
