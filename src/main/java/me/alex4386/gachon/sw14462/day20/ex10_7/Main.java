package me.alex4386.gachon.sw14462.day20.ex10_7;

import java.util.Arrays;

public class Main {

    private static<T> void printSorting (T[] arr) {
        System.out.println("Before Sorting:");
        for (T t : arr) {
            System.out.println(t);
        }

        System.out.println();
        Arrays.sort(arr);

        System.out.println("After Sorting:");
        for (T t : arr) {
            System.out.println(t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Bob", 2);
        students[1] = new Student("Alex", 3);
        students[2] = new Student("Charlie", 1);

        printSorting(students);

        System.out.println("Converting to StudentLexical for Lexical Sorting");
        StudentLexical[] studentsLexical = new StudentLexical[3];
        for (int i = 0; i < students.length; i++) {
            studentsLexical[i] = new StudentLexical(students[i]);
        }

        printSorting(studentsLexical);
    }
}
