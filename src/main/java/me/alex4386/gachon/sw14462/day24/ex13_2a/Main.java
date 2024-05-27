package me.alex4386.gachon.sw14462.day24.ex13_2a;

import java.io.*;
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
        ObjectOutputStream writer;
        try {
            targetFile.createNewFile();
            stream = new FileOutputStream(targetFile);
            writer = new ObjectOutputStream(stream);
        } catch (Exception e) {
            System.err.println("Failed to create file: " + e.getMessage());
            return;
        }

        try {
            writer.writeObject(randomIntegers);
        } catch (IOException e) {
            System.err.println("Failed to write object: " + e.getMessage());
            return;
        }

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

        int[] readIntegers = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(targetFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            readIntegers = (int[]) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            System.err.println("Failed to read object: " + e.getMessage());
            return;
        }

        int count = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        double average;

        for (int val : readIntegers) {
            count++;
            sum += val;
            if (val < min) min = val;
            if (val > max) max = val;
        }

        average = (double) sum / count;
        scanner.close();

        System.out.println("min: "+min);
        System.out.println("max: "+max);
        System.out.println("sum: "+sum);
        System.out.println("average: "+average);
    }
}
