package me.alex4386.gachon.sw14462.day10.ex6_1a;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time();

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

        System.out.println("Test scenario 4: Setting time with setTime (05:49)");
        time.setTime(5, 49);
        System.out.println("Expected: 05:49");
        System.out.println("Actual: " + time.toString());

        System.out.println("Test scenario 5: Setting time with setTime2 (05:49 PM)");
        time.setTime2(5, 49, true);
        System.out.println("Expected: 17:49");
        System.out.println("Actual: " + time.toString());
    }
}
