package me.alex4386.gachon.sw14462.day05;

import java.util.Scanner;

public class Ex3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the triangle: ");
        int size = scanner.nextInt();

        // validity check
        if (size > 50 || size < 1) {
            System.err.println("Invalid input. Please enter a number between 1 and 50.");
            return;
        }

        StarTrianglePrinter printer = new StarTrianglePrinter(size);
        printer.print(System.out);
    }
}
