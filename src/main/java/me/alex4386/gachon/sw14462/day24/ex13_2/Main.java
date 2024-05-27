package me.alex4386.gachon.sw14462.day24.ex13_2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File in = new File("in");
        File out = new File("out");

        if (!in.exists()) {
            System.err.println("File named 'in' not found");
            System.exit(1);
        }

        if (out.exists()) {
            out.delete();
        }

        try {
            out.createNewFile();
        } catch (Exception e) {
            System.err.println("Failed to create file: " + e.getMessage());
            return;
        }

        // assume that the numbers in the input file are already ordered from smallest to largest:
        // which means the number came beforehand is same with current number, it is a duplicate.

        // read the file
        int prevInt = 0;
        try {
            Scanner scanner = new Scanner(in);
            PrintWriter writer = new PrintWriter(out);

            boolean isFirst = true;

            while (scanner.hasNextInt()) {
                int currentInt = scanner.nextInt();

                if (isFirst) {
                    isFirst = false;
                    prevInt = currentInt;
                    writer.println(currentInt);
                } else {
                    if (prevInt != currentInt) {
                        writer.println(currentInt);
                        prevInt = currentInt;
                    }
                }
            }

            scanner.close();
            writer.close();
        } catch (Exception e) {
            System.err.println("Failed to read/write file: " + e.getMessage());
            return;
        }
    }
}
