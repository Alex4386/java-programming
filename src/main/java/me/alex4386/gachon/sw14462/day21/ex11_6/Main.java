package me.alex4386.gachon.sw14462.day21.ex11_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee Manager");

        int count = 0;
        System.out.print("Enter Employee Count: ");
        count = scanner.nextInt();
        scanner.nextLine();

        EmployeeManager manager = new EmployeeManager(count);
        for (int i = 0; i < count; i++) {
            System.out.println("Enter Employee #" + (i + 1) + " Info:");

            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("SSN: ");
            String ssn = scanner.nextLine();
            System.out.print("Salary: ");
            int salary = scanner.nextInt();
            scanner.nextLine();

            manager.registerEmployee(name, ssn, salary);
        }

        System.out.println();
        manager.printEmployees();
    }
}
