package me.alex4386.gachon.sw14462.day25.ex14_5;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> counts = new HashMap<>();

        while(true) {
            int value = scanner.nextInt();
            if (value == -1) break;

            if (counts.containsKey(value)) {
                counts.put(value, counts.get(value) + 1);
            } else {
                counts.put(value, 1);
            }
        }

        for (Integer key : counts.keySet()) {
            System.out.println("The number "+ key + " occurs " + counts.get(key) + " times.");
        }
    }
}
