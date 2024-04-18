package me.alex4386.gachon.sw14462.day14.ex7_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EXTRA DEMOS ===");
        System.out.println("Contrary to Exercise 7_2a, This program demonstrates the bubble sort algorithm.");

        System.out.println("=== DEMO 1 ===");
        int[] testArr1 = {10, 5, 2, 7, 8, 3, 1, 6, 4, 9};
        System.out.println("Before sort:");
        showArray(testArr1);

        ArraySorter.bubbleSort(testArr1);
        System.out.println("After sort:");
        showArray(testArr1);

        System.out.println("=== DEMO 2 ===");
        int[] testArr2 = {174,2984,2874,16,283,3984,2983,28784,21873,27,1,256,2};
        System.out.println("Before sort:");
        showArray(testArr2);

        ArraySorter.bubbleSort(testArr2);

        System.out.println("After sort:");
        showArray(testArr2);

        System.out.println("=== DEMO 3 ===");
        int[] testArr3 = {9, 16,5, 1, 2, 10, 4,3, 3, 2};
        System.out.println("Before sort:");
        showArray(testArr3);
        ArraySorter.bubbleSort(testArr3);
        System.out.println("After sort:");
        showArray(testArr3);

        System.out.println("=== Extra demos END ===");
    }


    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
