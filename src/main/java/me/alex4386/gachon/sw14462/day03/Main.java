package me.alex4386.gachon.sw14462.day03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 2_1. Read a four-digit integer and display one digit per line");
        Main.exercise2_1();

        System.out.println("");
        System.out.println("Exercise 2_2. Convert Fahrenheit to Celsius");
        Main.exercise2_2();
    }

    public static void exercise2_1() {
        Scanner scanner = new Scanner(System.in);

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

    public static void exercise2_2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = FahrenheitConverter.toCelsius(fahrenheit);
        System.out.printf("The temperature in Celsius is %.02f°C.\n", celsius);
    }
}
