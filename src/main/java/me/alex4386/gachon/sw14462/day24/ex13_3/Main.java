package me.alex4386.gachon.sw14462.day24.ex13_3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File wordFile = new File("words.txt");

        if (!wordFile.exists()) {
            System.err.println("Word file not found: words.txt");
            System.exit(1);
        }

        Scanner scanner;
        try {
            scanner = new Scanner(wordFile);
        } catch(IOException e) {
            System.err.println("Failed to open file: " + e.getMessage());
            return;
        }

        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            if (word.endsWith("dous")) {
                System.out.println(word);
            }
        }

    }
}
