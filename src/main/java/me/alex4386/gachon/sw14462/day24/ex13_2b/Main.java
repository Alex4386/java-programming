package me.alex4386.gachon.sw14462.day24.ex13_2b;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File signalFile = new File("signal.txt");
        if (!signalFile.exists()) {
            System.err.println("Signal file not found: signal.txt");
            System.exit(1);
        }

        int[] readIntegers = new int[10];
        FileInputStream stream;
        Scanner scanner;
        try {
            stream = new FileInputStream(signalFile);
            scanner = new Scanner(stream);
        } catch (Exception e) {
            System.err.println("Failed to open file: " + e.getMessage());
            return;
        }

        try {
            for (int i = 0; i < 10; i++) {
                readIntegers[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.err.println("Failed to read file: " + e.getMessage());
            return;
        }

        scanner.close();

        File outputFile = new File("signal.out");
        if (outputFile.exists()) {
            outputFile.delete();
        }

        FileOutputStream outputStream;
        try {
            outputFile.createNewFile();
            outputStream = new FileOutputStream(outputFile);
        } catch (Exception e) {
            System.err.println("Failed to create file: " + e.getMessage());
            return;
        }

        ObjectOutputStream objOutStream;
        int[] diffIntegers = new int[10];
        diffIntegers[0] = readIntegers[0];
        for (int i = 1; i < 10; i++) {
            int diff = readIntegers[i] - readIntegers[i - 1];
            if (diff > 128 || diff < -127) {
                System.err.println("Value out of range: " + diff);
                return;
            }

            diffIntegers[i] = diff;
        }

        try {
            objOutStream = new ObjectOutputStream(outputStream);
            objOutStream.writeObject(diffIntegers);
        } catch (Exception e) {
            System.err.println("Failed to write object: " + e.getMessage());
            return;
        }

        try {
            objOutStream.close();
        } catch (Exception e) {
            System.err.println("Failed to close file: " + e.getMessage());
            return;
        }

        File targetFile = new File("signal.exp");
        try {
            if (!targetFile.exists()) {
                targetFile.createNewFile();
            } else {
                targetFile.delete();
                targetFile.createNewFile();
            }
        } catch (IOException e) {
            System.err.println("Failed to create file: " + e.getMessage());
            return;
        }

        // read back
        FileInputStream fileInputStream;
        ObjectInputStream objInStream;

        try {
            fileInputStream = new FileInputStream(outputFile);
            objInStream = new ObjectInputStream(fileInputStream);
        } catch (Exception e) {
            System.err.println("Failed to open file: " + e.getMessage());
            return;
        }

        int[] exportedIntegers = null;
        try {
            exportedIntegers = (int[]) objInStream.readObject();
        } catch (Exception e) {
            System.err.println("Failed to read object: " + e.getMessage());
            return;
        }

        // process exported integers
        for (int i = 1; i < 10; i++) {
            exportedIntegers[i] += exportedIntegers[i - 1];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(exportedIntegers[i]);
        }
    }
}
