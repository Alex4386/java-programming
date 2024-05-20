package me.alex4386.gachon.sw14462.day23.ex13_1b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String targetFilename = "names.txt";
        String firstNameCache = "";

        File file = new File(targetFilename);
        if (!file.exists()) {
            System.err.println("File not found: " + targetFilename);
            System.exit(1);
        }

        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            System.exit(1);
            return;
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] names = line.split(" ");

            for (int i = 0; i < names.length; i++) {
                if (firstNameCache.equals("")) {
                    firstNameCache = names[i];
                } else {
                    System.out.println(firstNameCache + " " + names[i]);
                    firstNameCache = "";
                }
            }
        }

        scanner.close();
    }
}
