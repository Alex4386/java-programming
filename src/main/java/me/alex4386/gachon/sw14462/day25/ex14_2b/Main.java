package me.alex4386.gachon.sw14462.day25.ex14_2b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static <T> HashSet<T> arrayToHashSet(T[] array) {
        HashSet<T> set = new HashSet<>();
        for (T item : array) {
            set.add(item);
        }
        return set;
    }

    public static <T extends Object> void removeFromHashSet(HashSet<T> set, T key) {
        set.remove(key);
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

    public static <T extends Object> void printSet(Set<T> set) {
        printIterable(set);
    }

    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e"};
        System.out.println("Array: ");
        printIterable(Arrays.asList(array));

        HashSet<String> set = arrayToHashSet(array);
        System.out.println("HashSet: ");
        printSet(set);

        System.out.println("HashSet after removing c: ");
        removeFromHashSet(set, "c");
        printSet(set);
    }
}
