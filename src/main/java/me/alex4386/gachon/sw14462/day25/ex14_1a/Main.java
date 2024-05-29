package me.alex4386.gachon.sw14462.day25.ex14_1a;

import java.util.ArrayList;

public class Main {
    public static ArrayList<String> arrayToList(String[] array) {
        ArrayList<String> list = new ArrayList<String>();
        for (String item : array) {
            list.add(item);
        }
        return list;
    }

    public static void removeFromArrayList(ArrayList<String> list, String s) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(s)) {
                list.remove(i);
                i--;
            }
        }
    }

    public static <T extends Object> void printArray(T[] array) {
        boolean first = true;
        for (Object item : array) {
            if (!first) System.out.print(", ");
            first = false;
            System.out.print(item);
        }
        System.out.println();
    }

    public static <U, T extends Iterable<U>> void printIterable(T iter) {
        boolean first = true;
        for (Object item : iter) {
            if (!first) System.out.print(", ");
            first = false;
            System.out.print(item);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e"};
        System.out.println("Array: ");
        printArray(array);


        System.out.println("ArrayList: ");
        ArrayList<String> list = arrayToList(array);
        printIterable(list);

        System.out.println("Removed \"c\" from ArrayList: ");
        removeFromArrayList(list, "c");
        printIterable(list);
    }

}
