package me.alex4386.gachon.sw14462.day21.ex11_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Date Parser on:");
        Scanner scanner = new Scanner(System.in);
        DateParser parser = new DateParser();
        while (true) {
            System.out.print("Enter a date (mm/dd): ");
            String date = scanner.nextLine();

            if (date.equals("e")) {
                break;
            }
            try {
                System.out.println(parser.parseDate(date));
            } catch (MonthException e) {
                System.out.println("Invalid Month");
            } catch (DayException e) {
                System.out.println("Invalid Day");
            }
        }

    }
}
