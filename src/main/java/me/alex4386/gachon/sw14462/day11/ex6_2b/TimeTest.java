package me.alex4386.gachon.sw14462.day11.ex6_2b;

public class TimeTest {
    public static void main(String[] args) {
        System.out.println("Test scenario 1: valid time (12:49)");
        boolean result = Time.isValid(12, 49);
        System.out.println("Expected: true");
        System.out.println("Actual: " + result);

        System.out.println("Test scenario 2: invalid time (24:00)");
        result = Time.isValid(24, 0);
        System.out.println("Expected: false");
        System.out.println("Actual: " + result);

        System.out.println("Test scenario 3: invalid time (12:60)");
        result = Time.isValid(12, 60);
        System.out.println("Expected: false");
        System.out.println("Actual: " + result);

        System.out.println("Test scenario 4: Initialize Time to (05:49)");
        Time time = new Time(5, 49);
        System.out.println("Expected: 05:49");
        System.out.println("Actual: " + time.toString());

        System.out.println("Test scenario 5: Initialize Time with alternative constructor to 05:49 PM (17:49)");
        time = new Time(5, 49, true);
        System.out.println("Expected: 17:49");
        System.out.println("Actual: " + time.toString());

        System.out.println("Test scenario 6: Test time.getTime24() is 17:49");
        System.out.println("Expected: 1749");
        System.out.println("Actual: " + time.getTime24());

        System.out.println("Test scenario 7: Test time.getTime12() is 5:49 PM");
        System.out.println("Expected: 5:49 PM");
        System.out.println("Actual: " + time.getTime12());
    }
}
