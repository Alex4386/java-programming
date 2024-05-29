package me.alex4386.gachon.sw14462.day25.ex14_11;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Pushing "+i+" to queue");
            queue.addToQueue(i);

            System.out.println("Current Queue Content:");
            printIterator(queue.iterator());
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            int value = queue.removeFromQueue().intValue();
            System.out.println("Popping "+value+" from queue");

            System.out.println("Current Queue Content:");
            printIterator(queue.iterator());
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Pushing "+i+" to queue");
            queue.addToQueue(i);

            System.out.println("Current Queue Content:");
            printIterator(queue.iterator());
            System.out.println();
        }


        while (!queue.isEmpty()) {
            int value = queue.removeFromQueue().intValue();
            System.out.println("Popping "+value+" from queue");

            System.out.println("Current Queue Content:");
            printIterator(queue.iterator());
            System.out.println();
        }
    }

    public static<T extends Object> void printIterator(Iterator<T> iter) {
        boolean first = true;
        while (iter.hasNext()) {
            if (!first) System.out.print(", ");
            first = false;
            System.out.print(iter.next());
        }
        System.out.println();
    }
}
