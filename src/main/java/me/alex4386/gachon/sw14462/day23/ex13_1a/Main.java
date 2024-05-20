package me.alex4386.gachon.sw14462.day23.ex13_1a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();

        // generate 10 random integer
        int[] randomIntegers = new int[10];
        for (int i = 0; i < 10; i++) {
            randomIntegers[i] = (int) (Math.random() * 1000);
        }

        // write to file
        File targetFile = new File(filename);
        if (targetFile.exists()) {
            // unlink the file
            targetFile.delete();
        }

        FileOutputStream stream;
        try {
            targetFile.createNewFile();
            stream = new FileOutputStream(targetFile);
        } catch (Exception e) {
            System.err.println("Failed to create file: " + e.getMessage());
            return;
        }

        PrintWriter writer = new PrintWriter(stream);
        for (int i = 0; i < 10; i++) {
            writer.println(randomIntegers[i]);
        }

        writer.close();
        System.out.println("File created successfully.");

        scanner.close();

        // reopen the file
        targetFile = new File(filename);
        if (!targetFile.exists()) {
            System.err.println("File does not exists, is the file has been deleted in the meantime?");
            return;
        }

        try {
            scanner = new Scanner(targetFile);
        } catch (Exception e) {
            System.err.println("Failed to open file: " + e.getMessage());
            return;
        }

        int count = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        double average;

        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String content = scanner.nextLine();
            if (content.trim().equals("")) continue;

            int value = 0;
            try {
                value = Integer.parseInt(content);
            } catch (NumberFormatException e) {
                System.err.println("Invalid number: " + e.getMessage());
                continue;
            }

            integers.add(value);
            count++;
            sum += value;
            if (value < min) min = value;
            if (value > max) max = value;
        }

        average = (double) sum / count;
        scanner.close();


        System.out.println("min: "+min);
        System.out.println("max: "+max);
        System.out.println("sum: "+sum);
        System.out.println("average: "+average);

    }
}
