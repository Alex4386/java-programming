package me.alex4386.gachon.sw14462.day24.ex13_5;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File abbreviationFile = new File("abbreviations.txt");
        if (!abbreviationFile.exists()) {
            System.err.println("Abbreviation file not found: abbreviations.txt");
            System.err.println("Falling back to jar file internal...");

            System.exit(1);
        }

        File chatFile = new File("chat.txt");
        if (!chatFile.exists()) {
            System.err.println("Chat file not found: chat.txt");
            System.exit(1);
        }

        // wrap words (seperated by line) specified in abbreviations file with <> in chat file
        List<String> abbreviations = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(abbreviationFile);
            while (scanner.hasNextLine()) {
                abbreviations.add(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            System.err.println("Failed to read abbreviations file: " + e.getMessage());
            return;
        }

        try {
            Scanner scanner = new Scanner(chatFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (String abbreviation : abbreviations) {
                    // escape regex for special characters
                    String abbreviationEscaped = abbreviation.replaceAll("([\\[\\]\\{\\}\\(\\)\\*\\+\\?\\^\\$\\.\\|])", "\\\\$1");
                    line = line.replaceAll(abbreviationEscaped, "<" + abbreviation + ">");
                }
                System.out.println(line);
            }
            scanner.close();
        } catch (Exception e) {
            System.err.println("Failed to read chat file: " + e.getMessage());
            return;
        }
    }
}
