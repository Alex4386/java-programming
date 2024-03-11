package me.alex4386.gachon.sw14462.day03;

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
    }

    public static void exercise2_1a() {
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

    public static void exercise2_1b() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = FahrenheitConverter.toCelsius(fahrenheit);
        System.out.printf("The temperature in Celsius is %.02f°C.\n", celsius);
    }

    public static void exercise2_2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String updatedSentence = WordShuffler.moveFirstWordToLast(sentence);

        System.out.println(updatedSentence);
    }
}
