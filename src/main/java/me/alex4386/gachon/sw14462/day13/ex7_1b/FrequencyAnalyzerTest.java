package me.alex4386.gachon.sw14462.day13.ex7_1b;

import java.util.Scanner;

public class FrequencyAnalyzerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FrequencyAnalyzer analyzer = null;

        while (true) {
            System.out.print("Enter your phone number: ");
            String phoneNumber = scanner.nextLine();

            if (phoneNumber.equals("exit")) {
                break;
            }

            analyzer = analyzer == null ? new FrequencyAnalyzer(phoneNumber) : analyzer;
            analyzer.setInput(phoneNumber);

            System.out.println("Frequency of each digit:");
            int[] frequency = analyzer.getFrequency();
            for (int i = 0; i < frequency.length; i++) {
                System.out.println(i + ": " + frequency[i]);
            }
        }
    }
}
