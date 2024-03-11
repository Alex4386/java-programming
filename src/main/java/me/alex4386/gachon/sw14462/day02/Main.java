package me.alex4386.gachon.sw14462.day02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 01_01");
        birthYearHandler();

        System.out.println("Exercise 01_02");
        integerIteratorHandler();
    }

    public static void birthYearHandler() {
        Scanner stdinScanner = new Scanner(System.in);

        System.out.print("Enter birth year:");
        String birthYearRaw = stdinScanner.nextLine();

        try {
            int birthYear = Integer.parseInt(birthYearRaw, 10);

            AgeCalculator calc = new AgeCalculator(birthYear);
            int age = calc.getAge();

            System.out.println(age);
        } catch (NumberFormatException e) {
            System.err.println("Invalid year input!");
        } catch (NotBornYetException e) {
            System.err.println("Requested birth year is future");
        }
    }

    public static void integerIteratorHandler() {
        Scanner stdinScanner = new Scanner(System.in);

        System.out.print("Enter starting integer:");
        String rangeStartRaw = stdinScanner.nextLine();
        System.out.print("Enter ending integer:");
        String rangeEndRaw = stdinScanner.nextLine();

        try {
            int rangeStart = Integer.parseInt(rangeStartRaw, 10);
            int rangeEnd = Integer.parseInt(rangeEndRaw, 10);

            IntegerIterator iterator = new IntegerIterator(rangeStart, rangeEnd);
            List<Integer> iteratedList = iterator.getIntegersBetween();

            System.out.println(iteratedList.size());
        } catch (NumberFormatException e) {
            System.err.println("Invalid year input!");
        } catch (InvalidRangeException e) {
            System.err.println("Provided Range is invalid");
        }
    }
}